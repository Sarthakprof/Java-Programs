package com.sarthak.concept.JAVA8;

import java.time.Clock;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CompletablefutureEx {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {

            // Asynchronous task
            System.out.println("Asynchronous task");
        });


        CompletableFuture<String> future2 = new CompletableFuture<>();
        future2.complete("Result"); // Completes the future with a result

        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> "Hello");
        CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> "World");

        CompletableFuture<String> combinedFuture = future1.thenCombine(future3, (result1, result2) -> result1 + " " + result2);

        System.out.print(combinedFuture.get());

        CompletableFuture<Object> future4 = CompletableFuture.supplyAsync(() -> {
            // Perform some computation that may throw an exception
            throw new RuntimeException("Exception occurred");
        }).exceptionally(ex -> {
            System.out.println("Exception: " + ex.getMessage());
            return 0; // Fallback value
        });

        CompletableFuture<String> future5 = CompletableFuture.supplyAsync(() -> "Hello")
                .thenApply(result -> result + " World")
                .thenApply(String::toUpperCase);


        CompletableFuture<String> future6 = CompletableFuture.supplyAsync(() -> "Hello");
        String result = future6.join();


        CompletableFuture<String> future7 = CompletableFuture.supplyAsync(() -> {
            // Some long-running computation
            return "Result";
        });
        // Cancel future after 1 second
        future.orTimeout(1, TimeUnit.SECONDS);




    }
}
