package br.com.patterns.chainofresposibility.ordered;

import br.com.patterns.user.User;

public class CompanyUserBlockOrdered extends ChainOfResponsibilityHandlerOrdered {

    public CompanyUserBlockOrdered(UserLockOrdered userLockOrdered) {
        this.nextUserLockOrdered = userLockOrdered;
    }

    @Override
    public boolean shouldApply(User user) {
        return true;
    }

    @Override
    public void applyLock(User user, String blockedUserIp) {
        System.out.printf("Bloqueando usuário B2B %s, com ip: %s\n", user.getName(), blockedUserIp);
    }

    @Override
    public void handleRequest(User user, String blockedUserIp) {
        if (shouldApply(user)) {
            applyLock(user, blockedUserIp);
        }
        if (this.nextUserLockOrdered != null) {
            this.nextUserLockOrdered.handleRequest(user, blockedUserIp);
        }
    }
}
