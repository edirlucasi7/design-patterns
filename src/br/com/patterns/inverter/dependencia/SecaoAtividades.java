package br.com.patterns.inverter.dependencia;

import java.util.*;

public class SecaoAtividades {

    private String title;
    private SortedSet<Teoria> teorias = new TreeSet<>();
    private SortedSet<Atividade> atividades = new TreeSet<>();

    public SecaoAtividades(String title, List<? extends ProdutorNovaTeoria> produtorNovaTeorias, List<? extends ProdutorNovaAtividade> produtorNovaAtividades) {
        this.title = title;

        produtorNovaTeorias.forEach(novaTeoriaRequest -> teorias.add(novaTeoriaRequest.toTeoria(this.title)));
        produtorNovaAtividades.forEach(novaAtividadeRequest -> atividades.add(novaAtividadeRequest.toAtividade(this)));
    }
}
