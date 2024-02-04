package br.com.patterns.strategy.sso;

import br.com.patterns.strategy.user.User;

import java.util.List;
import java.util.Optional;

public class SOOLoadService {

    private List<SSOLoadUser> ssoLoadUsers;

    public SOOLoadService(List<SSOLoadUser> ssoLoadUsers) {
        this.ssoLoadUsers = ssoLoadUsers;
    }

    public Optional<User> findUser(CompanySSO companySSO, String userKey) {
        SSOLoadUser ssoLoadUser = filter(companySSO.getSsoStrategy()).orElseThrow(IllegalArgumentException::new);
        return ssoLoadUser.findUser(userKey);
    }

    private Optional<SSOLoadUser> filter(SSOStrategy strategy) {
        return ssoLoadUsers.stream().filter(sso -> strategy.equals(sso.getSSOUserStrategy())).findFirst();
    }
}
