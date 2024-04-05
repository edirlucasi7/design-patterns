package br.com.patterns.templatemethod;

import java.math.BigDecimal;

public class PurchaseOrder extends OrderTemplate {

    public PurchaseOrder(String nome, BigDecimal price) {
        super(nome, price);
    }

    @Override
    boolean validate() {
        return this.price.compareTo(BigDecimal.ZERO) > 0;
    }

    @Override
    void process() {
        boolean isValidOrder = validate();
        if (isValidOrder) {
            System.out.println("Validated order");
            System.out.println("Processing purchase order..");
            return;
        }
        System.out.println("Unable to validate order");
    }
}
