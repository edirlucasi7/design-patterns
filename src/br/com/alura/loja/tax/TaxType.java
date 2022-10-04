package br.com.alura.loja.tax;

import br.com.alura.loja.orcamento.Budget;

import java.math.BigDecimal;

public interface TaxType {

    BigDecimal calc(Budget budget);
}
