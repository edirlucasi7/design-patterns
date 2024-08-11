package br.com.patterns.memento;

public class BankAccountSnapshot {

    private final BankAccount bankAccount;
    private final String accountNumber;
    private final double balance;

    public BankAccountSnapshot(BankAccount bankAccount, String accountNumber, double balance) {
        this.bankAccount = bankAccount;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void restore() {
        bankAccount.restore(this);
    }

    @Override
    public String toString() {
        return "BankAccountSnapshot{" +
                "bankAccount=" + bankAccount +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
