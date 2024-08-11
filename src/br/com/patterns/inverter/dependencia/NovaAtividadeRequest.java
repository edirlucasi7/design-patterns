package br.com.patterns.inverter.dependencia;

public class NovaAtividadeRequest implements ProdutorNovaAtividade {

    private String name;

    public NovaAtividadeRequest(String name) {
        this.name = name;
    }

    @Override
    public Atividade toAtividade(SecaoAtividades secaoAtividades) {
        return new Atividade(name, secaoAtividades);
    }

    public String getName() {
        return name;
    }
}
