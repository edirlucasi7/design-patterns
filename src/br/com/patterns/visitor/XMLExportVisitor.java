package br.com.patterns.visitor;

public class XMLExportVisitor implements Visitor {

    @Override
    public void visitDot(Dot dot) {
        System.out.println("I am dot");
    }

    @Override
    public void visitCircle(Circle circle) {
        System.out.println("I am circle");
    }

    @Override
    public void visitRectangle(Rectangle rectangle) {
        System.out.println("I am rectangle");
    }

    @Override
    public void visitCompoundShape(CompoundShape compoundShape) {
        System.out.println("I am compoundShape");
    }
}
