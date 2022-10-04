package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

public class InProgress extends BudgetStatus {

    @Override
    public BigDecimal calcExtraReductionValue(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.02"));
    }

    @Override
    public void approve(Budget budget) {
        budget.setSituation(new Approved());
    }

    @Override
    public void disapprove(Budget budget) {
        budget.setSituation(new Disapproved());
    }
}
