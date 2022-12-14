package br.com.alura.loja.demand;

import java.math.BigDecimal;

public class GenerateOrder {

    private String cliente;
    private BigDecimal value;
    private int quantity;

    public GenerateOrder(String cliente, BigDecimal value, int quantity) {
        this.cliente = cliente;
        this.value = value;
        this.quantity = quantity;
    }

    public String getCliente() {
        return cliente;
    }

    public BigDecimal getValue() {
        return value;
    }

    public int getQuantity() {
        return quantity;
    }
}
