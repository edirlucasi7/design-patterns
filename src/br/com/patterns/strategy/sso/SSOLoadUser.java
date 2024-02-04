package br.com.patterns.strategy.sso;

import br.com.patterns.strategy.user.User;

import java.util.Optional;

public interface SSOLoadUser {

    Optional<User> findUser(String userKey);

    SSOStrategy getSSOUserStrategy();
}
