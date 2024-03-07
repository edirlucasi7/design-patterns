package br.com.patterns.observer;

import java.util.*;

public class EventManager {

    public Map<String, Set<EventListeners>> listeners = new HashMap<>();

    public void subscribe(String eventType, Set<EventListeners> eventListeners) {
        listeners.put(eventType, eventListeners);
    }

    public void unsubscribe(String eventType, Set<EventListeners> listenersToRemove) {
        Set<EventListeners> eventListeners = listeners.get(eventType);
        eventListeners.removeAll(listenersToRemove);
    }

    public void notify(String eventType, String data) {
        listeners.entrySet().stream()
                .filter(entry -> entry.getKey().equals(eventType))
                .flatMap(entry -> entry.getValue().stream())
                .forEach(listener -> listener.update(data));
    }
}
