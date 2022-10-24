package br.com.alura.loja.orcamento;

import br.com.alura.loja.demand.*;

import java.math.BigDecimal;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Budget budget = new Budget(new BigDecimal("100"), 2);
        System.out.println(budget);

        budget.applyExtraReduction();
        budget.approve();

        System.out.println(budget);

        GenerateOrder order = new GenerateOrder("Edir", new BigDecimal("100"), 2);
        GenerateOrderHandler handler = new GenerateOrderHandler(
                Arrays.asList(new SendEmailOrder())
        ); // poderia passar aqui qualquer coisa injetada
        handler.execute(order);
    }
}
