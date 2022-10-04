package br.com.alura.loja.tax;

import br.com.alura.loja.orcamento.Budget;

import java.math.BigDecimal;

public class ISS implements TaxType {

    public BigDecimal calc(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.6"));
    }
}
