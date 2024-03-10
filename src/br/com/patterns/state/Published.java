package br.com.patterns.state;

import br.com.patterns.user.User;

public class Published implements State {

    @Override
    public void render(User user, String text) {
        System.out.println("Published..."+text);
    }

    @Override
    public void publish(User user, String text) {
        System.out.println("Published..."+text);
    }

    @Override
    public String getState() {
        return "PUBLISHED";
    }
}
