package br.com.alura.loja.demand;

import br.com.alura.loja.orcamento.Budget;

import java.time.LocalDateTime;

public class Demand {

    private String cliente;
    private LocalDateTime date;
    private Budget budget;

    public Demand(String cliente, LocalDateTime date, Budget budget) {
        this.cliente = cliente;
        this.date = date;
        this.budget = budget;
    }

    public String getCliente() {
        return cliente;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public Budget getBudget() {
        return budget;
    }
}
