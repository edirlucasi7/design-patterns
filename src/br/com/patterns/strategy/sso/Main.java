package br.com.patterns.strategy.sso;

import br.com.patterns.strategy.user.User;

import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        CompanySSO lti = new CompanySSO(SSOProtocol.LTI, "companyToken", SSOStrategy.EMAIL);
        CompanySSO saml = new CompanySSO(SSOProtocol.SAML, "companyToken", SSOStrategy.CUSTOM_KEY);

        // essas instâncias são facilmente injetadas por um framework, como o spring.
        List<SSOLoadUser> ssoLoadUsers = List.of(new SSOLoadByEmail(), new SSOLoadByCustomKey());

        Optional<User> userByEmail = new SOOLoadService(ssoLoadUsers).findUser(lti, "icetylucas@gmail.com");
        System.out.println(userByEmail);

        Optional<User> userByCustomKey = new SOOLoadService(ssoLoadUsers).findUser(saml, "21062020");
        System.out.println(userByCustomKey);

        // ***-------------------------------------------------------------------------------------------------------***

        // cenário um pouco diferente, pois adiciona a interface genérica diretamente no contexto, nesse caso, foi adicionado
        // na CompanySSO. ter um método `executeStrategy` que retorna um `User` é um problema? Na minha opinião, não.
        CompanySSO lti2 = new CompanySSO(SSOProtocol.LTI, "companyToken", SSOStrategy.EMAIL, new SSOLoadByEmail());
        CompanySSO saml2 = new CompanySSO(SSOProtocol.SAML, "companyToken", SSOStrategy.CUSTOM_KEY, new SSOLoadByCustomKey());

        Optional<User> optionalUserLTI = lti2.executeStrategy("icetylucas@gmail.com");
        System.out.println(optionalUserLTI);

        Optional<User> optionalUserSAML = saml2.executeStrategy("21062020");
        System.out.println(optionalUserSAML);
    }
}
