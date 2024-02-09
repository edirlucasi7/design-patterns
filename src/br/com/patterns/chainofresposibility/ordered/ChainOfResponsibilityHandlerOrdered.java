package br.com.patterns.chainofresposibility.ordered;

public abstract class ChainOfResponsibilityHandlerOrdered implements UserLockOrdered {
    protected UserLockOrdered nextUserLockOrdered;
}