package br.com.patterns.strategy.sso;

import br.com.patterns.strategy.user.User;

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
