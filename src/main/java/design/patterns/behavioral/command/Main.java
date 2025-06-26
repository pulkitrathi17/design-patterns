package design.patterns.behavioral.command;

// Wrap a request (method call) in an object so it can be passed around, stored, executed later, or undone.
// We don't see this pattern much often as modern frameworks have annotations that hide this pattern as abstraction

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(lightOnCommand);
        remoteControl.pressButton();

        remoteControl.setCommand(lightOffCommand);
        remoteControl.pressButton();
    }
}
