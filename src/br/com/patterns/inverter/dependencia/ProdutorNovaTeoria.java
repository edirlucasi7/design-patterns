package br.com.patterns.inverter.dependencia;

public interface ProdutorNovaTeoria {

    Teoria toTeoria(SecaoAtividades secaoAtividades);

    Teoria toTeoria(String name);
}
