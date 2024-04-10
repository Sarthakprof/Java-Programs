package com.sarthak.concept.collections;


import com.sarthak.concept.arrayofobject.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student2{

    private String name;
    private int age;

    public Student2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class ContructorReferenceEx {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ganesh", "Mahesh", "Suresh");

        List<Student2> students = new ArrayList<>();

        //students = names.stream().map(name -> new Student2(name)).toList();

        //using contructor refernece

        students = names.stream().map(Student2::new).toList();

        System.out.println(students);
    }
}
