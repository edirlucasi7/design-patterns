package br.com.alura.loja.imposto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public interface TaxType {

    BigDecimal calc(Orcamento orcamento);
}
