package design.patterns.structural.facade;

class HomeTheaterFacade {
    private DVDPlayer dvd;
    private Projector projector;
    private SoundSystem sound;

    public HomeTheaterFacade(DVDPlayer dvd, Projector projector, SoundSystem sound) {
        this.dvd = dvd;
        this.projector = projector;
        this.sound = sound;
    }

    public void watchMovie() {
        System.out.println("Get ready to watch a movie...");
        dvd.on();
        projector.on();
        projector.setInput("DVD");
        sound.on();
        dvd.play();
    }
}