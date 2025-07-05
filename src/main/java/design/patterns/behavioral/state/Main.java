package design.patterns.behavioral.state;

// Behavioral design pattern that allows an object to alter its behavior when its internal state changes,
// appearing as if it has changed its class at runtime.


import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        JButton homeButton = new JButton("home");
        JButton powerButton = new JButton("power");

        homeButton.addActionListener(e -> {phone.getState().onHomeButtonClick();});
        powerButton.addActionListener(e -> {phone.getState().onPowerButtonClick();});

        homeButton.doClick();
        homeButton.doClick();

        powerButton.doClick();
        powerButton.doClick();

        homeButton.doClick();
        powerButton.doClick();
    }
}
