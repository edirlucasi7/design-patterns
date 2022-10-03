package br.com.alura.loja.deduction;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class WithoutDeduction extends Deduction {

    public WithoutDeduction() {
        super(null);
    }

    @Override
    public BigDecimal deductionCalc(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    @Override
    public boolean shouldApply(Orcamento orcamento) {
        return true;
    }
}
