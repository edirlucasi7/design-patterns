package br.com.patterns.observer;

public class Editor {

    public final EventManager events;
    private String file;

    public Editor() {
        this.events = new EventManager();
    }

    public void openFile(String path) {
        this.file = path;
        events.notify("open", this.file);
    }

    public void saveFile(String path) {
        this.file = path;
        events.notify("save", this.file);
    }
}
