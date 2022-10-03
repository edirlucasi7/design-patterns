package br.com.alura.loja.deduction;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Deduction {

    protected Deduction next;

    public Deduction(Deduction next) {
        this.next = next;
    }

    public BigDecimal calc(Orcamento orcamento) {
        if(shouldApply(orcamento)) {
            return deductionCalc(orcamento);
        }
        return next.calc(orcamento);
    }

    protected abstract BigDecimal deductionCalc(Orcamento orcamento);
    protected abstract boolean shouldApply(Orcamento orcamento);
}
