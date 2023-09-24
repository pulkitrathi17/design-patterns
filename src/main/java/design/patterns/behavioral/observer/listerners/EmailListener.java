package design.patterns.behavioral.observer.listerners;

public class EmailListener implements EventListener {

  String email;

  public EmailListener(String email) {
    this.email = email;
  }

  @Override
  public void update() {
    System.out.println("Notification sent to: " + email);
  }
}
