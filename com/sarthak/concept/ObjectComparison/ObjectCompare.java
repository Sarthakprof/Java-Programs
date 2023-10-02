package com.sarthak.concept.ObjectComparison;

import java.util.Objects;

public class ObjectCompare {


    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

    //to string method
    @Override
    public String toString() {
        return "ObjectCompare{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }



    //equals and hashcode method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjectCompare that = (ObjectCompare) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }



    //getter and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}
