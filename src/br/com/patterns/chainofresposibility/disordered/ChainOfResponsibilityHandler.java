package br.com.patterns.chainofresposibility.disordered;

import br.com.patterns.user.User;

import java.util.List;

public class ChainOfResponsibilityHandler {

    private final List<UserLock> userLocks;

    public ChainOfResponsibilityHandler(List<UserLock> userLocks) {
        this.userLocks = userLocks;
    }

    public void handler(User user, String blockedUserIp) {
        this.userLocks.stream()
                .filter(userLock -> userLock.shouldApply(user))
                .findFirst()
                .ifPresent(userLock -> userLock.applyLock(user, blockedUserIp));
    }
}
