package br.com.patterns.observer;

import java.util.Objects;

public class LoggingListener implements EventListeners {

    private final String log;
    private final String message;

    public LoggingListener(String log, String message) {
        this.log = log;
        this.message = message;
    }

    @Override
    public void update(String fileName) {
        System.out.printf("%s-%s: %s\n", this.log, fileName, this.message);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoggingListener that = (LoggingListener) o;
        return Objects.equals(log, that.log) && Objects.equals(message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(log, message);
    }
}
