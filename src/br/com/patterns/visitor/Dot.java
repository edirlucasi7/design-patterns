package br.com.patterns.visitor;

public class Dot implements Shape {

    private String dot;

    public Dot(String dot) {
        this.dot = dot;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitDot(this);
    }
}
