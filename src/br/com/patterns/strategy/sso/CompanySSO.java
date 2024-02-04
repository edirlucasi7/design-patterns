package br.com.patterns.strategy.sso;

import br.com.patterns.strategy.user.User;

import java.util.Optional;

public class CompanySSO {

    private SSOProtocol ssoProtocol;

    private String companyToken;

    private SSOStrategy ssoStrategy;

    private SSOLoadUser ssoLoadUser;

    public CompanySSO(SSOProtocol ssoProtocol, String companyToken, SSOStrategy ssoStrategy) {
        this.ssoProtocol = ssoProtocol;
        this.companyToken = companyToken;
        this.ssoStrategy = ssoStrategy;
    }

    public CompanySSO(SSOProtocol ssoProtocol, String companyToken, SSOStrategy ssoStrategy, SSOLoadUser ssoLoadUser) {
        this.ssoProtocol = ssoProtocol;
        this.companyToken = companyToken;
        this.ssoStrategy = ssoStrategy;
        this.ssoLoadUser = ssoLoadUser;
    }

    public SSOProtocol getSsoProtocol() {
        return ssoProtocol;
    }

    public String getCompanyToken() {
        return companyToken;
    }

    public SSOStrategy getSsoStrategy() {
        return ssoStrategy;
    }

    Optional<User> executeStrategy(String userKey) {
        return ssoLoadUser.findUser(userKey);
    }
}
