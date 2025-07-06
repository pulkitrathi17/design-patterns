package design.patterns.behavioral.state.state;

import design.patterns.behavioral.state.Phone;

// abstract class instead of interface to define a function here in case its functionality is same in all states
public abstract class State {
    Phone phone;
    public State(Phone phone) {
        this.phone = phone;
    }
    public abstract void onHomeButtonClick();
    public abstract void onPowerButtonClick();
}
