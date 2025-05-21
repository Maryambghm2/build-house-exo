package org.example.creational;

import org.example.creational.builder.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.Builder().firstname("toto").lastname("tata").age(42).build();

        System.out.println(person);

        Person person1 = new Person.Builder().age(54).lastname("tutu").firstname("titi").build();

        System.out.println(person1);

        Person person2 = new Person.Builder().lastname("test").firstname("test").build();
        Person person3 = new Person.Builder().firstname("test").build();

        System.out.println(person2);
        System.out.println(person3);
    }
}
