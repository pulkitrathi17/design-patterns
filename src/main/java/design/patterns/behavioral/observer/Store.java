package design.patterns.behavioral.observer;

public class Store {
  private NotificationService notificationService;
  public Store(NotificationService notificationService){
    this.notificationService = notificationService;
  }

  void addItem(){
    notificationService.notifySubs();
  }

  NotificationService getNotificationService(){
    return notificationService;
  }
}
