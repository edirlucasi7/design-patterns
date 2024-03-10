package br.com.patterns.state;

import br.com.patterns.user.User;

import static br.com.patterns.user.Permission.*;

public class Document {

    public String text;
    public State state;

    public Document(String text, State state) {
        this.text = text;
        this.state = state;
    }

    public void render(User user) {
        if (ADMIN.equals(user.getPermission()) || AUTHOR.equals(user.getPermission())) {
            this.state.render(user, text);
        }
    }

    public void publish(User user) {
        if ("MODERATION".equals(this.state.getState()) && ADMIN.equals(user.getPermission())) {
            this.changeState(new Published());
            this.state.publish(user, text);
            return;
        }
        System.out.println("The user does not have permission to publish the document");
    }

    public void changeState(State state) {
        this.state = state;
    }
}