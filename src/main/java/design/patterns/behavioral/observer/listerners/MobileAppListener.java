package design.patterns.behavioral.observer.listerners;

public class MobileAppListener implements EventListener {

  String number;

  public MobileAppListener(String number) {
    this.number = number;
  }

  @Override
  public void update() {
    System.out.println("Notification sent to: " + number);
  }
}
