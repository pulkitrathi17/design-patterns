package design.patterns.behavioral.observer.listerners;

import design.patterns.behavioral.observer.listerners.EventListener;

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
