package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

public abstract class BudgetStatus {

    public BigDecimal calcExtraReductionValue(Budget budget) {
        return BigDecimal.ZERO;
    }

    public void approve(Budget budget) {
        throw new RuntimeException("Orcamento nao pode ser aprovado!");
    }

    public void disapprove(Budget budget) {
        throw new RuntimeException("Orcamento nao pode ser reprovado!");
    }

    public void finish(Budget budget) {
        throw new RuntimeException("Orcamento nao pode ser finalizado!");
    }
}
