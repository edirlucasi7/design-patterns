package br.com.patterns.state;

import br.com.patterns.user.User;

public class Moderation implements State {

    @Override
    public void render(User user, String text) {
        System.out.println("Moderation..."+text);
    }

    @Override
    public void publish(User user, String text) {
        System.out.println("Moderation..."+text);
    }

    @Override
    public String getState() {
        return "MODERATION";
    }
}
