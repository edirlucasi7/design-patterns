package br.com.patterns.templatemethod;

import java.math.BigDecimal;
import java.time.LocalDate;

import static java.time.LocalDate.now;

public abstract class OrderTemplate {

    private String name;
    protected BigDecimal price;
    private LocalDate createdAt = now();

    public OrderTemplate(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public void processOrder() {
        validate();
        process();
        sendNotification();
    }

    abstract boolean validate();

    abstract void process();

    private void sendNotification() {
        System.out.println("Sending notification...");
    }
}
