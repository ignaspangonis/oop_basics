package com.itacademy.java.oop.basics.task_4;

public class AccountApplication {
    public static void main(String[] args) {
        Account accountOne = new Account("1", "Ignas", 100);
        Account accountTwo = new Account("2", "Tomas", 50);
        System.out.println(accountOne.credit(20));
        System.out.println(accountOne.credit(10));
        System.out.println(accountTwo.credit(20));
        accountOne.debit(500);
        accountTwo.transferTo(accountOne, 70);
        System.out.println(accountOne.debit(30));
        accountOne.transferTo(accountTwo, 10);
        System.out.println("First account balance: " + accountOne.getBalance());
        System.out.println("Second account balance: " + accountTwo.getBalance());
        System.out.println(accountOne);
        System.out.println(accountTwo);
    }
}
