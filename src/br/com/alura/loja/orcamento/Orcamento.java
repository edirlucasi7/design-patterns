package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal value;

    private int itemsQuantity;

    public Orcamento(BigDecimal value, int itemsQuantity) {
        this.value = value;
        this.itemsQuantity  = itemsQuantity;
    }

    public BigDecimal getValue() {
        return value;
    }

    public int getItemsQuantity() {
        return itemsQuantity;
    }
}
