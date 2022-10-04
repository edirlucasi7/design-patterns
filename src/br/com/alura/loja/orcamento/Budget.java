package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

public class Budget {

    private BigDecimal value;
    private int itemsQuantity;
    private BudgetStatus situation;

    public Budget(BigDecimal value, int itemsQuantity) {
        this.value = value;
        this.itemsQuantity  = itemsQuantity;
        this.situation = new InProgress();
    }

    public void applyExtraReduction() {
        BigDecimal value = this.situation.calcExtraReductionValue(this);
        this.value = this.value.subtract(value);
    }

    public void approve() {
        this.situation.approve(this);
    }

    public void disapprove() {
        this.situation.disapprove(this);
    }

    public void finish() {
        this.situation.finish(this);
    }

    public BudgetStatus getSituation() {
        return situation;
    }

    public void setSituation(BudgetStatus situation) {
        this.situation = situation;
    }

    public BigDecimal getValue() {
        return value;
    }

    public int getItemsQuantity() {
        return itemsQuantity;
    }

    @Override
    public String toString() {
        return "Budget{" +
                "value=" + value +
                ", itemsQuantity=" + itemsQuantity +
                ", situation=" + situation +
                '}';
    }
}
