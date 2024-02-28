package br.com.patterns.command;

import java.util.Stack;

public class CommandHistory {

    private Stack<Command> history = new Stack<>();

    public void executeCommand(Command command) {
        command.execute();
        history.push(command);
    }

    public Command getLastHistory() {
        return history.pop();
    }
}
