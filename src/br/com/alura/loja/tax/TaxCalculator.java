package br.com.alura.loja.tax;

import br.com.alura.loja.orcamento.Budget;

import java.math.BigDecimal;

public class TaxCalculator {

    public BigDecimal calc(Budget budget, TaxType type) {
        return type.calc(budget);
    }
}
