package br.com.patterns.command;

public class Main {

    public static void main(String[] args) {
        Editor editor = new Editor();
        CommandHistory commandHistory = new CommandHistory();

        commandHistory.executeCommand(new TypeCommand(editor, "Hello "));
        commandHistory.executeCommand(new TypeCommand(editor, "World"));

        editor.printContent();

        commandHistory.executeCommand(new TypeCommand(editor, "OPEN AI"));
        commandHistory.executeCommand(new CopyCommand(editor));
        commandHistory.executeCommand(new PasteCommand(editor));
        editor.printContent();

        // simulando um ctrl z
        Command lastHistory = commandHistory.getLastHistory();
        commandHistory.executeCommand(lastHistory);
        editor.printContent();
    }
}
