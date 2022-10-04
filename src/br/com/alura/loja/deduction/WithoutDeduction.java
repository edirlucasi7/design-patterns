package br.com.alura.loja.deduction;

import br.com.alura.loja.orcamento.Budget;

import java.math.BigDecimal;

public class WithoutDeduction extends Deduction {

    public WithoutDeduction() {
        super(null);
    }

    @Override
    public BigDecimal deductionCalc(Budget budget) {
        return BigDecimal.ZERO;
    }

    @Override
    public boolean shouldApply(Budget budget) {
        return true;
    }
}
