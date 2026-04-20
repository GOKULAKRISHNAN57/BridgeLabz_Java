package object_oriented_programming.oops_problems.Banking_System;

abstract class BankAccount {
    private int accountNumber;
    private double balance;

    public BankAccount(int acc, double bal) {
        this.accountNumber = acc;
        this.balance = bal;
    }

    public void deposit(double amt) {
        balance += amt;
    }

    public void withdraw(double amt) {
        balance -= amt;
    }

    public double getBalance() {
        return balance;
    }

    public abstract double calculateInterest();
}

interface Loanable {
    boolean applyForLoan();
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(int acc, double bal) {
        super(acc, bal);
    }

    public double calculateInterest() {
        return getBalance() * 0.04;
    }
}