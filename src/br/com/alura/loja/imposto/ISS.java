package br.com.alura.loja.imposto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS implements TaxType {

    public BigDecimal calc(Orcamento orcamento) {
        return orcamento.getValue().multiply(new BigDecimal("0.6"));
    }
}
