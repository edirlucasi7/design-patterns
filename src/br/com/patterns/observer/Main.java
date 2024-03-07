package br.com.patterns.observer;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Editor editor = new Editor();

        LoggingListener loggingListener = new LoggingListener("logging", "test");
        EmailAlertsListener emailAlertsListener = new EmailAlertsListener("email", "test");
        Set<EventListeners> listeners = new HashSet<>(Set.of(loggingListener, emailAlertsListener));
        editor.events.subscribe("open", listeners);

        Set<EventListeners> removedListeners = new HashSet<>(Set.of(loggingListener));
        editor.events.unsubscribe("open", removedListeners);

        editor.openFile("/test");
    }
}
