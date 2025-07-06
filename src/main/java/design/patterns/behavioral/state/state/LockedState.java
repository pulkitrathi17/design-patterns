package design.patterns.behavioral.state.state;

import design.patterns.behavioral.state.Phone;

public class LockedState extends State {

    public LockedState(Phone phone) {
        super(phone);
    }

    @Override
    public void onHomeButtonClick() {
        phone.setState(new ReadyState(phone));
        phone.unlock();
    }

    @Override
    public void onPowerButtonClick() {
        phone.setState(new OffState(phone));
        phone.lock();
    }
}
