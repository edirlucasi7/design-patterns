package br.com.patterns.visitor;

public interface Shape {
    void accept(Visitor visitor);
}