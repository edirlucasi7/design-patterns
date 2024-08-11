package br.com.patterns.visitor;

public class Rectangle implements Shape {

    private String rectangle;

    public Rectangle(String rectangle) {
        this.rectangle = rectangle;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitRectangle(this);
    }
}
