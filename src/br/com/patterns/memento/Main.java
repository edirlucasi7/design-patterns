package br.com.patterns.memento;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("12345", 1000.0);
        TransactionManager transactionManager = new TransactionManager(bankAccount);

        System.out.println("Initial State: " + bankAccount);

        transactionManager.backup();
        System.out.println(transactionManager.getHistory());

        try {
            bankAccount.deposit(500.0);
            System.out.println("Before Rollback: " + bankAccount);
            throw new IllegalArgumentException();
        } catch (Exception ex) {
            transactionManager.rollback();
        }

        System.out.println("After Rollback: " + bankAccount);
    }
}
