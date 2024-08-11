package br.com.patterns.inverter.dependencia;

public class Teoria implements Comparable<Teoria> {

    private String name;
    private SecaoAtividades secaoAtividades;

    public Teoria(String name) {
        this.name = name;
    }

    public Teoria(String name, SecaoAtividades secaoAtividades) {
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
    public int compareTo(Teoria o) {
        return 0;
    }
}
