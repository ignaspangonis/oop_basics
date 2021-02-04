package com.itacademy.java.oop.basics_2.lecture;

import com.itacademy.java.oop.basics_2.lecture.exception.MyCheckedException;
import com.itacademy.java.oop.basics_2.lecture.exception.NegativeBonusException;

public class Employee extends Person {

    private int salary;

    public Employee(String name, String surname) {
        super(name, surname);
    }

    public Employee(String name, String surname, int salary) {
        super(name, surname);
        this.salary = salary;
    }

    public Employee(String name, String surname, int salary, int age) {
        super(name, surname, age);
        this.salary = salary;
    }

    public Employee() {
        super();
    }

    public int getSalary() {
        return salary;
    }

    public int calculateSalary() {
        return salary * 2;
    }

    public double calculateSalary(int bonus)  {
        if (bonus < 0) {
            throw new NegativeBonusException("Negative bonus");
        } else {
            throw new ArithmeticException("");
        }
    }

    int calculateSalary(String salary) throws MyCheckedException {
        if (salary.equals("salary")) {
            throw new MyCheckedException();
        }
        return 5;
    }

    @Override
    void speak() {

    }

}
