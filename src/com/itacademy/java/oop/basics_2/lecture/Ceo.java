package com.itacademy.java.oop.basics_2.lecture;

public class Ceo extends Employee implements Human, Comparable<Ceo> {

    public Ceo() {
        super();
    }

    public Ceo(String name, String surname, int salary) {
        super(name, surname, salary);
    }

    public Ceo(String name, String surname, int salary, int age) {
        super(name, surname, salary, age);
    }

    public void print() {
        System.out.println("I am CEO");
    }

    @Override
    public void walk() {
        System.out.println("I am walking from CEO");
    }

    @Override
    public void fly() {
        System.out.println("I am flying from CEO");
    }

    @Override
    public void drive() {
        System.out.println("I am driving from CEO");
    }

    @Override
    public int compareTo(Ceo o) {
        return 0;
    }
}
