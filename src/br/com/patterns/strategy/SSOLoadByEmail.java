package br.com.patterns.strategy;

import br.com.patterns.user.User;

import java.util.Optional;

public class SSOLoadByEmail implements SSOLoadUser {

    @Override
    public Optional<User> findUser(String userKey) {
        return User.findUserByEmail(userKey);
    }

    @Override
    public SSOStrategy getSSOUserStrategy() {
        return SSOStrategy.EMAIL;
    }
}
