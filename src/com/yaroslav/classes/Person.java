package com.yaroslav.classes;

public class Person {
    private final String fullName;
    private final int age;

    public Person(){
        this.fullName = "Unknown";
        this.age = 14;
    }

    public Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }

    public void move(){
        System.out.println(fullName + " двигается");
    }

    public void talk(){
        System.out.println(fullName + " говорит");
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }
}
