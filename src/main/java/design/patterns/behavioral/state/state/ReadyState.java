package design.patterns.behavioral.state.state;

import design.patterns.behavioral.state.Phone;

public class ReadyState extends State {

    public ReadyState(Phone phone) {
        super(phone);
    }

    @Override
    public void onHomeButtonClick() {
        phone.home();
    }

    @Override
    public void onPowerButtonClick() {
        phone.setState(new LockedState(phone));
        phone.lock();
    }
}
