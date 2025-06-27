package design.patterns.behavioral.mediator;

/*
The Mediator Pattern is a behavioral design pattern that:
    - Defines an object (mediator) that centralizes communication between multiple objects (colleagues).
    - Prevents direct references between objects, reducing tight coupling.
    - Instead of objects talking to each other directly, they talk to a Mediator, which routes or coordinates communication.


Real-life Analogy:
    - Air Traffic Control (ATC)
        - Planes (colleagues) do not communicate directly to avoid collision.
        - Instead, ATC (mediator) manages who can land, take off, and when, coordinating all planes safely.
*/


public class Main {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatRoom();

        User user1 = new User("user1", mediator);
        User user2 = new User("user2", mediator);
        User user3 = new User("user3", mediator);

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        user1.sendMessage("Hi everyone. User1 here...");
    }
}
