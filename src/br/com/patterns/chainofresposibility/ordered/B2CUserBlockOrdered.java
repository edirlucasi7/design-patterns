package br.com.patterns.chainofresposibility.ordered;

import br.com.patterns.user.User;

public class B2CUserBlockOrdered extends ChainOfResponsibilityHandlerOrdered {

    public B2CUserBlockOrdered(UserLockOrdered userLockOrdered) {
        this.nextUserLockOrdered = userLockOrdered;
    }

    @Override
    public boolean shouldApply(User user) {
        return false;
    }

    @Override
    public void applyLock(User user, String blockedUserIp) {
        System.out.printf("Bloqueando usuário B2C %s, com ip: %s\n", user.getName(), blockedUserIp);
    }

    @Override
    public void handleRequest(User user, String blockedUserIp) {
        if (shouldApply(user)) {
            applyLock(user, blockedUserIp);
            System.out.print("[LOGGER] O Usuário foi bloqueado na conta B2B e na conta B2C.");
        }
    }
}
