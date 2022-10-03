package br.com.alura.loja.deduction;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DeductionMajorThatItemsFive extends Deduction {

    public DeductionMajorThatItemsFive(Deduction next) {
        super(next);
    }

    @Override
    public BigDecimal deductionCalc(Orcamento orcamento) {
        return orcamento.getValue().multiply(new BigDecimal("0.1"));
    }

    @Override
    public boolean shouldApply(Orcamento orcamento) {
        return orcamento.getItemsQuantity() > 5;
    }
}
