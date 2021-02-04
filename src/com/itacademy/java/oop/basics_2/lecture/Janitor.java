package com.itacademy.java.oop.basics_2.lecture;

public class Janitor extends Person implements Human {

    public int age = 50;

    public Janitor() {
    }

    public Janitor(String name, String surname) {
        super(name, surname);
    }

    public Janitor(String name, String surname, int age) {
        super(name, surname, age);
    }

    public int getAge() {
        return age;
    }



    @Override
    void speak() {

    }

    @Override
    public void print() {
        System.out.println("I am janitor");
    }

    @Override
    public String getSurname() {
        return "super.getSurname()";
    }

    @Override
    public void walk() {
        System.out.println("I am walking from Janitor");
    }

    @Override
    public void fly() {
        System.out.println("I am flying from Janitor");
    }

    @Override
    public void drive() {
        System.out.println("I am driving from Janitor");
    }
}
