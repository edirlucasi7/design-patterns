package br.com.alura.loja.deduction;

import br.com.alura.loja.orcamento.Budget;

import java.math.BigDecimal;

public class DeductionMajorWhenValueMajorThatFiveHundred extends Deduction {

    public DeductionMajorWhenValueMajorThatFiveHundred(Deduction next) {
        super(next);
    }

    @Override
    public BigDecimal deductionCalc(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.2"));
    }

    @Override
    public boolean shouldApply(Budget budget) {
        return budget.getValue().compareTo(new BigDecimal("500")) > 0;
    }
}
