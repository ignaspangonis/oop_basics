package com.itacademy.java.oop.basics_2.lecture;

import com.itacademy.java.oop.basics_2.lecture.exception.MyCheckedException;
import com.itacademy.java.oop.basics_2.lecture.exception.NegativeBonusException;

public class Main {

    public static void main(String[] args) {
        Employee john = new Employee("John", "Doe", 500, 24);
        try {
            john.calculateSalary(-500);
            john.calculateSalary("");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (NegativeBonusException n) {
            System.out.println(n.getMessage());
        } catch (MyCheckedException e) {
            System.out.println(e.getClass().getSimpleName());
        } finally {
            System.out.println("I am done!");
        }


        Person ceo = new Ceo();
        Person janitor = new Janitor();
        Person employee = new Employee();
        ceo.print();
        janitor.print();
        employee.print();
        System.out.println(janitor.age);
        System.out.println(janitor.getAge());

        System.out.println("Janitor surname");
        System.out.println(janitor.getSurname());

        Human interfaceCeo = new Ceo();
        Human interfaceJanitor = new Janitor();
        interfaceCeo.drive();
        interfaceCeo.fly();
        interfaceCeo.walk();
        interfaceJanitor.drive();
        interfaceJanitor.fly();
        interfaceJanitor.walk();
    }
}
