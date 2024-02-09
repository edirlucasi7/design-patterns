package br.com.patterns.strategy;

import br.com.patterns.user.User;

import java.util.Optional;

public interface SSOLoadUser {

    Optional<User> findUser(String userKey);

    SSOStrategy getSSOUserStrategy();
}
