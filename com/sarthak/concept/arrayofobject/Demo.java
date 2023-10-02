package com.sarthak.concept.arrayofobject;

public class Demo {

    public static void main(String[] args) {
        // Declare and initialize an array of objects of class Student
        Student[] students = new Student[3];

        // Create instances of Student and assign them to array elements
        students[0] = new Student("Alice", 20);
        students[1] = new Student("Bob", 22);
        students[2] = new Student("Charlie", 21);

        // Access objects in the array
        Student student1 = students[0];
        System.out.println(student1.getName()); // Output: Alice

// Modify objects in the array
        student1.setAge(21);

// Iterate over the array of objects
        for (Student student : students) {
            System.out.println(student.getName() + " is " + student.getAge() + " years old");
        }


    }
}
