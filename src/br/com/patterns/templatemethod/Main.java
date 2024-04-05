package br.com.patterns.templatemethod;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        PurchaseOrder purchaseOrder = new PurchaseOrder("Copo", new BigDecimal(10));
        purchaseOrder.processOrder();

        RefundOrder refundOrder = new RefundOrder("Relógio", new BigDecimal(50));
        refundOrder.processOrder();
    }
}
