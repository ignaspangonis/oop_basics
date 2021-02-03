package com.itacademy.java.oop.basics.task_1;

public class EmployeeManager {
    public static void main(String[] args) {
        Employee employee = new Employee(
                "Ignas",
                "Pangonis",
                ContractType.PART_TIME,
                "2021-04-01",
                1000,
                "Software Engineer"
        );
        System.out.println(employee.printInfo());
    }
}
