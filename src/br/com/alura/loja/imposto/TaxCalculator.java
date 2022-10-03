package br.com.alura.loja.imposto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TaxCalculator {

    public BigDecimal calc(Orcamento orcamento, TaxType type) {
        return type.calc(orcamento);
    }
}
