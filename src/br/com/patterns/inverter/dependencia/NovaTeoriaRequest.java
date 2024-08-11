package br.com.patterns.inverter.dependencia;

public class NovaTeoriaRequest implements ProdutorNovaTeoria {

    private String name;

    public NovaTeoriaRequest(String name) {
        this.name = name;
    }

    @Override
    public Teoria toTeoria(SecaoAtividades secaoAtividades) {
        return new Teoria(name, secaoAtividades);
    }

    @Override
    public Teoria toTeoria(String name) {
        return new Teoria(name);
    }

    public String getName() {
        return name;
    }
}
