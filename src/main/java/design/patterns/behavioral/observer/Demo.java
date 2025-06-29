package design.patterns.behavioral.observer;

import design.patterns.behavioral.observer.listerners.EmailListener;
import design.patterns.behavioral.observer.listerners.MobileAppListener;

// Behavioral design pattern where one object (Subject) maintains a list of dependents (Observers)
// and notifies them automatically of any state changes, usually by calling one of their methods.

// Use cases: Useful in event-driven microservices for clean pub-sub integration, File system watchers, Stock price update notifications.

public class Demo {

  public static void main(String[] args) {
    Store store = new Store(new NotificationService());
    store.getNotificationService().subscribe(new EmailListener("pulkit.oracle.com"));
    store.getNotificationService().subscribe(new MobileAppListener("94073287123"));

    store.addItem();
  }
}
