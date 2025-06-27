package design.patterns.behavioral.mediator;

public class User {
    String name;
    ChatMediator mediator;

    public User(String name, ChatMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    void receive(String message) {
        System.out.println(message);
    }

    void sendMessage(String message) {
        mediator.sendMessage(message, this);
    }
}
