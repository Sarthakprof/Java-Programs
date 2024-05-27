package com.sarthak.concept.JAVA8;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class DateTimeAPIEx {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        Instant instant = Instant.now();
        System.out.println(instant);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("Current Zoned Date and Time: " + zonedDateTime);

        Duration duration = Duration.ofHours(2);
        System.out.println("Duration: " + duration);

        Period period = Period.ofMonths(1);
        System.out.println("Period: " + period);

        LocalDate currentDate = LocalDate.now();
        LocalDate firstDayOfMonth = currentDate.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println("First Day of Month: " + firstDayOfMonth);

        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Formatted Date and Time: " + formattedDateTime);


    }

}
