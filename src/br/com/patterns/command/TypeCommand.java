package br.com.patterns.command;

public class TypeCommand implements Command {

    private Editor editor;
    private String text;

    public TypeCommand(Editor editor, String text) {
        this.editor = editor;
        this.text = text;
    }

    @Override
    public void execute() {
        editor.type(text);
    }
}
