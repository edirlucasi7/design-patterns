package br.com.alura.loja.deduction;

import br.com.alura.loja.orcamento.Budget;

import java.math.BigDecimal;

public class DeductionMajorThatItemsFive extends Deduction {

    public DeductionMajorThatItemsFive(Deduction next) {
        super(next);
    }

    @Override
    public BigDecimal deductionCalc(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.1"));
    }

    @Override
    public boolean shouldApply(Budget budget) {
        return budget.getItemsQuantity() > 5;
    }
}
