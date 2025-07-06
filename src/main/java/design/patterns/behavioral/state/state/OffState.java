package design.patterns.behavioral.state.state;

import design.patterns.behavioral.state.Phone;

public class OffState extends State {

    public OffState(Phone phone) {
        super(phone);
    }
    @Override
    public void onHomeButtonClick() {
        phone.setState(new LockedState(phone));
        phone.turnOn();
    }

    @Override
    public void onPowerButtonClick() {
        phone.setState(new LockedState(phone));
        phone.turnOn();
    }
}
