package br.com.patterns.state;

import br.com.patterns.user.User;

public interface State {

    void render(User user, String text);
    void publish(User user, String text);
    String getState();
}
