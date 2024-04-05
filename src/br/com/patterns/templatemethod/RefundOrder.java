package br.com.patterns.templatemethod;

import java.math.BigDecimal;

import static java.math.BigDecimal.ZERO;

public class RefundOrder extends OrderTemplate {

    public RefundOrder(String nome, BigDecimal price) {
        super(nome, price);
    }

    @Override
    boolean validate() {
        return this.price.compareTo(ZERO) > 0 && this.price.compareTo(BigDecimal.valueOf(50)) <= 0;
    }

    @Override
    void process() {
        boolean isValid = validate();
        if (isValid) {
            System.out.println("Processing refund order..");
            return;
        }
        System.out.println("This order does not accept refund");
    }
}
