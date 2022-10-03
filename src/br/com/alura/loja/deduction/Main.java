package br.com.alura.loja.deduction;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("150"), 6);
        Orcamento orcamento2 = new Orcamento(new BigDecimal("2000"), 1);

        DeductionCalculator calculator = new DeductionCalculator();
        System.out.println(calculator.calc(orcamento));
        System.out.println(calculator.calc(orcamento2));
    }
}