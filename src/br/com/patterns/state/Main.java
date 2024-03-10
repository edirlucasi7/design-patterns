package br.com.patterns.state;

import br.com.patterns.user.User;

import static br.com.patterns.user.Permission.*;

public class Main {

    public static void main(String[] args) {
        User user = new User(10L, "Edir", 123456, ADMIN);

        State draft = new Draft();
        State moderation = new Moderation();

//        Document draftDocument = new Document("Estou rascunhando meu livro.", draft);
//        draftDocument.publish(user);

        Document moderationDocument = new Document("Estou publicando meu livro.", moderation);
        moderationDocument.publish(user);
    }
}