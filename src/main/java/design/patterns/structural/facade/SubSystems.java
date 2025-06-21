package design.patterns.structural.facade;

class DVDPlayer {
    void on() { System.out.println("DVD Player ON"); }
    void play() { System.out.println("DVD Playing"); }
}

class Projector {
    void on() { System.out.println("Projector ON"); }
    void setInput(String source) { System.out.println("Input set to " + source); }
}

class SoundSystem {
    void on() { System.out.println("Sound System ON"); }
}