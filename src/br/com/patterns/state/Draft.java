package br.com.patterns.state;

import br.com.patterns.user.User;

public class Draft implements State {

    @Override
    public void render(User user, String text) {
        System.out.println("Draft..."+text);
    }

    @Override
    public void publish(User user, String text) {
        System.out.println("Draft..."+text);
    }

    @Override
    public String getState() {
        return "DRAFT";
    }
}
