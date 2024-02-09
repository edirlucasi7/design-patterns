package br.com.patterns.chainofresposibility.ordered;

import br.com.patterns.user.User;

public class Main {

    public static void main(String[] args) {

        UserLockOrdered b2b = new CompanyUserBlockOrdered(new B2CUserBlockOrdered(null));
        b2b.handleRequest(new User(1L, "Edir Lucas Icety", "icety@gmail.com"), "0.0.0.0");
    }
}
