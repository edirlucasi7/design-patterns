package br.com.alura.loja.orcamento;

public class Disapproved extends BudgetStatus {

    @Override
    public void finish(Budget budget) {
        budget.setSituation(new Finish());
    }
}
