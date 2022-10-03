package br.com.alura.loja.deduction;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DeductionMajorWhenValueMajorThatFiveHundred extends Deduction {

    public DeductionMajorWhenValueMajorThatFiveHundred(Deduction next) {
        super(next);
    }

    @Override
    public BigDecimal deductionCalc(Orcamento orcamento) {
        return orcamento.getValue().multiply(new BigDecimal("0.2"));
    }

    @Override
    public boolean shouldApply(Orcamento orcamento) {
        return orcamento.getValue().compareTo(new BigDecimal("500")) > 0;
    }
}
