package com.itacademy.java.oop.basics_2.lecture;

public abstract class Person {
    private String name;
    private String surname;
    public int age = 18;

    abstract void speak();

    public final String helloWorld() {
        return "Hello world!";
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.age = 20;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void print() {
        System.out.println("person");
    }

    public static void printAge() {
        System.out.println("my age");
    }
}
