package br.com.alura.loja.demand;

import br.com.alura.loja.orcamento.Budget;

import java.util.List;

import static java.time.LocalDateTime.now;

public class GenerateOrderHandler {

    private List<ActionAfterGenerateOrder> actions;

    public GenerateOrderHandler(List<ActionAfterGenerateOrder> actions) {
        this.actions = actions;
    }

    public void execute(GenerateOrder data) {
        Budget budget = new Budget(data.getValue(), data.getQuantity());
        Demand demand = new Demand(data.getCliente(), now(), budget);
        actions.forEach(a -> a.execute(demand));
    }
}
