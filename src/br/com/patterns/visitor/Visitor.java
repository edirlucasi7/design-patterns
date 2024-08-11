package br.com.patterns.visitor;

public interface Visitor {

    void visitDot(Dot dot);
    void visitCircle(Circle circle);
    void visitRectangle(Rectangle rectangle);
    void visitCompoundShape(CompoundShape compoundShape);
}
