package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

public class Approved extends BudgetStatus {

    @Override
    public BigDecimal calcExtraReductionValue(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.02"));
    }

    @Override
    public void finish(Budget budget) {
        budget.setSituation(new Finish());
    }
}
