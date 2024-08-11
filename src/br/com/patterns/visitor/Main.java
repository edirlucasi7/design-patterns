package br.com.patterns.visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Shape circle = new Circle("circle");
        Shape compoundShape = new CompoundShape("compoundShape");
        Shape dot = new Dot("dot");
        Shape rectangle = new Rectangle("rectangle");

        List<Shape> shapes = new ArrayList<>(List.of(circle, compoundShape, dot, rectangle));

        XMLExportVisitor xmlExportVisitor = new XMLExportVisitor();
        rectangle.accept(xmlExportVisitor);

        for (Shape shape : shapes) {
            shape.accept(xmlExportVisitor);
        }
    }
}