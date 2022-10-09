package br.com.alura.loja.orcamento;

import br.com.alura.loja.demand.GenerateOrder;
import br.com.alura.loja.demand.GenerateOrderHandler;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Budget budget = new Budget(new BigDecimal("100"), 2);
        System.out.println(budget);

        budget.applyExtraReduction();
        budget.approve();

        System.out.println(budget);

        GenerateOrder order = new GenerateOrder("Edir", new BigDecimal("100"), 2);
        GenerateOrderHandler handler = new GenerateOrderHandler(); // poderia passar aqui qualquer coisa injetada
        handler.execute(order);
    }
}
