package br.com.alura.loja.demand;

import br.com.alura.loja.orcamento.Budget;

import static java.time.LocalDateTime.now;

public class GenerateOrderHandler {

    public void execute(GenerateOrder data) {
        Budget budget = new Budget(data.getValue(), data.getQuantity());
        Demand demand = new Demand(data.getCliente(), now(), budget);
        // .. faz qualquer coisa dps
    }
}
