package com.itacademy.java.oop.basics.task_2;

public class LoansApplication {
    public static void main(String[] args) {

        Loan leasingLoan = new Loan(
                1,
                600,
                LoanType.LEASING,
                "2020-12-12"
        );
        Loan consumerLoan = new Loan(
                2,
                600,
                LoanType.CONSUMER,
                "2020-11-12"
        );
        Loan[] loans = {leasingLoan, consumerLoan};
        Customer customer = new Customer(
                "Ignas",
                "Pangonis",
                22,
                "+37061006364",
                loans
        );
        System.out.println(customer);
    }
}
