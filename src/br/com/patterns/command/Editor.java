package br.com.patterns.command;

public class Editor {

    private String clipBoard;
    private StringBuilder content;

    public Editor() {
        this.clipBoard = "";
        this.content = new StringBuilder();
    }

    public void copy() {
        clipBoard = content.toString();
    }

    public void paste() {
        content = new StringBuilder(clipBoard);
    }

    public void type(String text) {
        content.append(text);
    }

    public void printContent() {
        System.out.println("Content: " + content.toString());
    }
}
