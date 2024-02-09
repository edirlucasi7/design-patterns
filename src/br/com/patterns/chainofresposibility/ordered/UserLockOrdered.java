package br.com.patterns.chainofresposibility.ordered;

import br.com.patterns.user.User;

public interface UserLockOrdered {

    boolean shouldApply(User user);
    void applyLock(User user, String blockedUserIp);
    void handleRequest(User user, String blockedUserIp);
}
