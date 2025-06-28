package design.patterns.behavioral.mediator;

import java.util.*;

public class ChatRoom implements ChatMediator {
    List<User> users = new ArrayList<>();

    @Override
    public void sendMessage(String message, User sender) {
        for(User user : users) {
            if(sender.name != user.name) {
                user.receiveMessage(message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
