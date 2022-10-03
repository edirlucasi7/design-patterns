package br.com.alura.loja.deduction;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DeductionCalculator {

    public BigDecimal calc(Orcamento orcamento) {
        Deduction cadeiaDeDescontos = new DeductionMajorThatItemsFive(
                new DeductionMajorWhenValueMajorThatFiveHundred(
                        new WithoutDeduction()));

        return cadeiaDeDescontos.calc(orcamento);
    }
}
