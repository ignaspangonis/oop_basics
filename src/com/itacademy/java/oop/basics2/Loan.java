package com.itacademy.java.oop.basics2;

public class Loan {
    private int id;
    private double amount;
    private LoanType loanType;
    private String terminationDate;

    public Loan(int id, double amount, LoanType loanType, String terminationDate) {
        this.id = id;
        this.amount = amount;
        this.loanType = loanType;
        this.terminationDate = terminationDate;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "id=" + id +
                ", amount=" + amount +
                ", loanType=" + loanType +
                ", terminationDate='" + terminationDate + '\'' +
                '}';
    }
}
