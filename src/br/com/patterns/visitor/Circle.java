package br.com.patterns.visitor;

public class Circle implements Shape {

    private String circle;

    public Circle(String circle) {
        this.circle = circle;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCircle(this);
    }
}
