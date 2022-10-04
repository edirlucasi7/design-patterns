package br.com.alura.loja.deduction;

import br.com.alura.loja.orcamento.Budget;

import java.math.BigDecimal;

public class DeductionCalculator {

    public BigDecimal calc(Budget budget) {
        Deduction cadeiaDeDescontos = new DeductionMajorThatItemsFive(
                new DeductionMajorWhenValueMajorThatFiveHundred(
                        new WithoutDeduction()));

        return cadeiaDeDescontos.calc(budget);
    }
}
