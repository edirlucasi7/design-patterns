package br.com.patterns.chainofresposibility.disordered;

import br.com.patterns.user.User;

public class B2CUserBlock implements UserLock {

    @Override
    public boolean shouldApply(User user) {
        return false;
    }

    @Override
    public void applyLock(User user, String blockedUserIp) {
        System.out.printf("Bloqueando usuário B2C %s, com ip: %s", user.getName(), blockedUserIp);
    }
}
