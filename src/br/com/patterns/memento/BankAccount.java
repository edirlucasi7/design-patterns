package br.com.patterns.memento;

public class BankAccount {

    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }


    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public BankAccountSnapshot createSnapshot() {
        return new BankAccountSnapshot(this, accountNumber, balance);
    }

    public void restore(BankAccountSnapshot snapshot) {
        this.accountNumber = snapshot.getAccountNumber();
        this.balance = snapshot.getBalance();
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
