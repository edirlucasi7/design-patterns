package br.com.patterns.memento;

import java.util.Stack;

public class TransactionManager {

    private final BankAccount bankAccount;
    private final Stack<BankAccountSnapshot> history;

    public TransactionManager(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
        this.history = new Stack<>();
    }

    public void backup() {
        history.push(bankAccount.createSnapshot());
    }

    public Stack<BankAccountSnapshot> getHistory() {
        return history;
    }

    public void rollback() {
        if (!history.isEmpty()) {
            BankAccountSnapshot snapshot = history.pop();
            snapshot.restore();
        } else {
            System.out.println("No transactions to rollback.");
        }
    }

    @Override
    public String toString() {
        return "TransactionManager{" +
                "bankAccount=" + bankAccount +
                ", history=" + history +
                '}';
    }
}
