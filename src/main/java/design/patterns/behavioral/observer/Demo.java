package design.patterns.behavioral.observer;

import design.patterns.behavioral.observer.listerners.EmailListener;
import design.patterns.behavioral.observer.listerners.MobileAppListener;

public class Demo {

  public static void main(String[] args) {
    Store store = new Store(new NotificationService());
    store.getNotificationService().subscribe(new EmailListener("pulkit.oracle.com"));
    store.getNotificationService().subscribe(new MobileAppListener("94073287123"));

    store.addItem();
  }
}
