package br.com.patterns.observer;

import java.util.Objects;

public class EmailAlertsListener implements EventListeners {

    private final String email;
    private final String message;

    public EmailAlertsListener(String email, String message) {
        this.email = email;
        this.message = message;
    }

    @Override
    public void update(String fileName) {
        System.out.printf("%s-%s: %s\n", this.email, fileName, this.message);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmailAlertsListener that = (EmailAlertsListener) o;
        return Objects.equals(email, that.email) && Objects.equals(message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, message);
    }
}
