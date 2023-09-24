package design.patterns.behavioral.observer;

import design.patterns.behavioral.observer.listerners.EventListener;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {

  List<EventListener> list = new ArrayList<>();

  void notifySubs() {
    list.forEach(eventListener -> eventListener.update());
  }

  void subscribe(EventListener eventListener) {
    list.add(eventListener);
  }

  void unsubscribe(EventListener eventListener) {
    list.remove(eventListener);
  }
}
