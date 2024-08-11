package br.com.patterns.visitor;

public class CompoundShape implements Shape {

    private String compoundShape;

    public CompoundShape(String compoundShape) {
        this.compoundShape = compoundShape;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCompoundShape(this);
    }
}