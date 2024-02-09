package br.com.patterns.strategy;

import br.com.patterns.user.User;

import java.util.Optional;

public class SSOLoadByCustomKey implements SSOLoadUser {

    @Override
    public Optional<User> findUser(String userKey) {
        return User.findUserByCustomKey(userKey);
    }

    @Override
    public SSOStrategy getSSOUserStrategy() {
        return SSOStrategy.CUSTOM_KEY;
    }
}
