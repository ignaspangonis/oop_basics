package com.itacademy.java.oop.basics;

public class Employee {
    private String name;
    private String surname;
    private ContractType contractType;
    private String contractStartDate;
    private double salary;
    private String position;

    public Employee(String name, String surname, ContractType contractType, String contractStartDate, double salary, String position) {
        this.name = name;
        this.surname = surname;
        this.contractType = contractType;
        this.contractStartDate = contractStartDate;
        this.salary = salary;
        this.position = position;
    }

    public String printInfo() {
        return "Employee:\n" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", contractType=" + contractType +
                ", contractStartDate='" + contractStartDate + '\'' +
                ", salary=" + salary +
                ", position='" + position + '\'';
    }
}
