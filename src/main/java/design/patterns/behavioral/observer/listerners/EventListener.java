package design.patterns.behavioral.observer.listerners;

public interface EventListener {

  // Actual logic for sending notification like sending mail or SMS
  void update();
}
