package com.yaroslav.main;

import com.yaroslav.classes.Person;
import com.yaroslav.classes.User;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Artem Malyshev",6);
        Person person2 = new Person();

        System.out.println(person1.getFullName());
        System.out.println(person2.getFullName());

        User user1 = new User("yaroslav","123456");
        System.out.println(user1.getPassword());
    }
}