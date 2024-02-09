package br.com.patterns.chainofresposibility.disordered;

import br.com.patterns.user.User;

public interface UserLock {

    boolean shouldApply(User user);

    void applyLock(User user, String blockedUserIp);
}