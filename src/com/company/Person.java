package com.company;

public class Person {
    public String name;
    public int age;

    public Person(String name, int age){
        this.age = age;
        this.name = name;
    }
    public int getAge(int age) {
        this.age = age;
        return age;
    }
}
