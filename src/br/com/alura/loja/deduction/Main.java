package br.com.alura.loja.deduction;

import br.com.alura.loja.orcamento.Budget;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Budget budget = new Budget(new BigDecimal("150"), 6);
        Budget budget2 = new Budget(new BigDecimal("2000"), 1);

        DeductionCalculator calculator = new DeductionCalculator();
        System.out.println(calculator.calc(budget));
        System.out.println(calculator.calc(budget2));
    }
}