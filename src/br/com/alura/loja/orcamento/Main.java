package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Budget budget = new Budget(new BigDecimal("100"), 2);
        System.out.println(budget);

        budget.applyExtraReduction();
        budget.approve();

        System.out.println(budget);
    }
}
