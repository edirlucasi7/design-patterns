package br.com.alura.loja.deduction;

import br.com.alura.loja.orcamento.Budget;

import java.math.BigDecimal;

public abstract class Deduction {

    protected Deduction next;

    public Deduction(Deduction next) {
        this.next = next;
    }

    public BigDecimal calc(Budget budget) {
        if(shouldApply(budget)) {
            return deductionCalc(budget);
        }
        return next.calc(budget);
    }

    protected abstract BigDecimal deductionCalc(Budget budget);
    protected abstract boolean shouldApply(Budget budget);
}
