package design.patterns.behavioral.state;

import design.patterns.behavioral.state.state.*;
import lombok.*;

@Getter
@Setter
public class Phone {
    private State state;
    public Phone() {
        state = new OffState(this);
        System.out.println("Starting phone...");
    }

    public void lock() {
        System.out.println("Locking phone...");
    }

    public void home() {
        System.out.println("Going to home screen...");
    }

    public void unlock() {
        System.out.println("Unlocking phone...");
    }

    public void turnOn() {
        System.out.println("Turning on phone. Device still locked...");
    }
}
