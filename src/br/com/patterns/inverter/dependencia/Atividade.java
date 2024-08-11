package br.com.patterns.inverter.dependencia;

public class Atividade implements Comparable<Atividade> {

    private String name;
    private SecaoAtividades secaoAtividades;

    public Atividade(String name, SecaoAtividades secaoAtividades) {
        this.name = name;
        this.secaoAtividades = secaoAtividades;
    }

    public String getName() {
        return name;
    }

    public SecaoAtividades getSecaoAtividades() {
        return secaoAtividades;
    }

    @Override
    public int compareTo(Atividade o) {
        return 0;
    }
}
