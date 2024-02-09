package br.com.patterns.chainofresposibility.disordered;

import br.com.patterns.user.User;

public class CompanyUserBlock implements UserLock {

    @Override
    public boolean shouldApply(User user) {
        return true;
    }

    @Override
    public void applyLock(User user, String blockedUserIp) {
        System.out.printf("Bloqueando usuário B2B %s, com ip: %s", user.getName(), blockedUserIp);
    }
}
