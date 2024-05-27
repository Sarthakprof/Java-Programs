package com.sarthak.concept.JAVA8;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPI {

    public static void main(String[] args) {

        //Intermediate Operation
        //FMS - Filter(), Map(), Sorted(), distinct()
       /** MAP() EXAMPLE **/
       //Map() function using ArrayList
       List<String> names = Arrays.asList("India", "America", "Australia");
       List<String> upperCaseNames =  names.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
       //using method reference in map()
       List<String> upperCaseNamess =  names.stream().map(String::toUpperCase).toList();
       System.out.println(upperCaseNamess);

       //Map() function Using HashMap
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Mango");

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        System.out.println(entries);

        //using method reference
        Map<Integer, String> transformedMap = map.entrySet().stream().map(entry -> {
            String transformedString = entry.getValue() + "-Fruit";
            return Map.entry(entry.getKey(), transformedString);
        }).collect(Collectors.toMap(Map.Entry :: getKey, Map.Entry :: getValue));

        //using lambda exp
        Map<Integer, String> transformedMap2 = map.entrySet().stream().map(entry -> {
            String transformedString = entry.getValue() + "-Fruit";
            return Map.entry(entry.getKey(), transformedString);
        }).collect(Collectors.toMap(entry -> entry.getKey(), entry ->entry.getValue()));


        // Demonstrating Set using HashSet
        // Declaring object of type String
        Set<String> hash_Set = new HashSet<String>();

        // Adding elements to the Set
        // using add() method
        hash_Set.add("Geeks");
        hash_Set.add("For");
        hash_Set.add("Geeks");
        hash_Set.add("Example");
        hash_Set.add("Set");

        // Printing elements of HashSet object
        System.out.println(hash_Set);

        List<String> str1 = hash_Set.stream().map(String :: toUpperCase).collect(Collectors.toList());
        System.out.println(str1);

        //using map() function to Mapping String to Integer
        List<String> integerSample = Arrays.asList("1", "2", "3", "4");

        List<Integer> integerList = integerSample.stream().map(list -> Integer.parseInt(list)).collect(Collectors.toList());
        List<Integer> integerList2 = integerSample.stream().map(Integer::parseInt).toList();

        System.out.println("Integer List: " +integerList2);
        //Mapping Integer to String
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<String> numberStrings = numbers.stream()
                .map(Object::toString)
                .toList();
        System.out.println("String List: " +integerList2);
/*        class Person {
            private String name;
            // constructor, getters, and setters
        }

        List<Person> people = Arrays.asList(new Person("Alice"), new Person("Bob"), new Person("Charlie"));
        List<String> names = people.stream()
                .map(Person::getName)
                .collect(Collectors.toList());*/


     /*   class UserDTO {
            private String username;
            private int age;
            // constructor, getters, and setters
        }

        List<User> users = userRepository.findAll();
        List<UserDTO> userDTOs = users.stream()
                .map(user -> new UserDTO(user.getUsername(), user.getAge()))
                .collect(Collectors.toList());*/


        /** FILTER EXAMPLE **/
        //filter
        List<String> namesFilter = names.stream().filter(str -> str.startsWith("A")).toList();
        System.out.println(namesFilter);

        //sorted
        List<String> sortedNames = names.stream().sorted().toList();
        System.out.println(sortedNames);
        List<String> reverseSortedNames = names.stream().sorted().toList().reversed();
        System.out.println(reverseSortedNames);


        //Filtering Integers:
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = numbers1.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        //Filtering Strings:
        List<String> names1 = Arrays.asList("Alice", "Bob", "Charlie", "David", "Emma");
        List<String> longNames = names1.stream()
                .filter(name -> name.length() > 4)
                .toList();
      /*  class Person {
            private String name;
            private int age;
            // constructor, getters, and setters
        }

        List<Person> people = // list of Person objects
                List<Person> adults = people.stream()
                        .filter(person -> person.getAge() >= 18)
                        .collect(Collectors.toList());*/

        //filtering based on condition
        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> greaterThanFive = numbers2.stream()
                .filter(n -> n > 5)
                .toList();

//filtering unique elements
        List<Integer> numbers3 = Arrays.asList(1, 2, 3, 3, 4, 4, 5, 5);
        List<Integer> uniqueNumbers = numbers3.stream()
                .distinct()
                .toList();

        //filter+map
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");
        List<String> filteredAndMapped = words.stream()
                .filter(word -> word.length() > 5)
                .map(String::toUpperCase)
                .toList();


        //filtering null checks
        List<String> strings = Arrays.asList("apple", null, "banana", null, "cherry");
        List<String> nonNullStrings = strings.stream()
                .filter(Objects::nonNull)
                .toList();


        //sorted()
        //sorting based on CASE

        List<String> words2 = Arrays.asList("apple", "Banana", "cherry", "Date");
        List<String> caseInsensitiveSorted = words2.stream()
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .toList();


        //Sorting based on Length:
        List<String> words3 = Arrays.asList("apple", "banana", "cherry", "date");
        List<String> sortedByLength = words3.stream()
                .sorted(Comparator.comparingInt(String::length))
                .toList();


        /**Terminal Operations**/
        //forEach(), reduce(), collect()

        //collect () method
     List<String> str4 = Stream.of("a", "b", "c")
             .toList();

/*     Set<Integer> int5 = Stream.of(1, 2, 3, 3)
             .collect(Collectors.toSet());
     Map<Integer, String> map5 = Stream.of("a", "b", "c")
             .collect(Collectors.toMap(String::length, s -> s));
     String joined = Stream.of("a", "b", "c")
             .collect(Collectors.joining(", "));*/
    //custom collector
     List<Integer> evenNumbers5 = Stream.of(1, 2, 3, 4, 5)
             .collect(ArrayList::new,
                     (list, element) -> {
                      if (element % 2 == 0) list.add(element);
                     },
                     ArrayList::addAll);


     //forEach() method

     Stream.of("aa","ba","ca").forEach(System.out :: println);

     Stream.of("aa","ba","ca").forEach(num -> System.out.println("Hellow" + num));

     List<Integer> squares  = new ArrayList<>();

     Stream.of(1,2,3,4).forEach(num -> squares.add(num * num));

     System.out.println(squares);

     List<String> strings6 = Arrays.asList("foo", "bar", "baz");
     strings6.stream()
             .map(String::toUpperCase)
             .forEach(System.out::println);
     List<Integer> numbers6 = Arrays.asList(1, 2, 3, 4, 5);
     numbers6.parallelStream()
             .forEach(System.out::println);


     //reduce method

     int sum = Stream.of(1,2,3,4).reduce(0, (a,b)->(a+b));
     int sum2 = Stream.of(1,2,3,4).reduce(0, Integer::sum);
     System.out.println(sum2);
     int max = Stream.of(1,2,3,4).reduce(0, Integer::max);
     System.out.println(max);
     String concatenated = Stream.of("Hello", " ", "world", "!")
             .reduce("", String::concat);
     System.out.println(concatenated);

     int totalLength = Stream.of("apple", "banana", "orange")
             .map(String::length)
             .reduce(0, Integer::sum);

     // Short Circuit Operations
        //anyMatch(), findFirst()
     //anyMatch()

     //anyMatch return the boolean value
     //takes Predicate interface parameter
     boolean hasEvenValue = Stream.of(1,2,3).anyMatch(n->n%2==0);
     System.out.println(hasEvenValue);

     boolean startsWithA = Stream.of("apple", "banana", "orange")
             .anyMatch(s -> s.startsWith("a"));

//     boolean anyGreaterThan10 = IntStream.of(5, 8, 12, 3, 7)
//             .anyMatch(num -> num > 10);


/*     List<Person> people = Arrays.asList(
             new Person("Alice", 25),
             new Person("Bob", 30),
             new Person("Charlie", 20)
     );

     boolean anyAdult = people.stream()
             .anyMatch(person -> person.getAge() >= 18);*/

     //findFirst()
     //The findFirst() method in the Stream API is used to retrieve the first element
     // of the stream, if any. It returns an Optional containing the first element,
     // or an empty Optional if the stream is empty.

     Optional<Integer> firstElement = Stream.of(1,2,3).findFirst();
     System.out.println(firstElement);

     Optional<String> firstString = Stream.of("apple", "banana", "cherry")
             .findFirst();
     OptionalInt firstEven = IntStream.of(1, 3, 5, 6, 7)
             .filter(num -> num % 2 == 0)
             .findFirst();
     /*List<Person> people = Arrays.asList(
             new Person("Alice", 25),
             new Person("Bob", 30),
             new Person("Charlie", 20)
     );

     Optional<Person> firstPersonWithNameStartingWithA = people.stream()
             .filter(person -> person.getName().startsWith("A"))
             .findFirst();*/


     Random random = new Random();
     Supplier<Integer> supplier = () -> random.nextInt(100);

     Optional<Integer> firstRandomNumber = Stream.generate(supplier)
             .findFirst();

     System.out.println(firstRandomNumber.get());




    }

}
