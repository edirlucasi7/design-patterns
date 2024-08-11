package br.com.patterns.inverter.dependencia;

public interface ProdutorNovaAtividade {

    Atividade toAtividade(SecaoAtividades secaoAtividades);
}
