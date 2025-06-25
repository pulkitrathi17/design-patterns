package design.patterns.behavioral.chainofresponsibility.handler;

public class SecondHandler extends Handler {
    @Override
    public void handleRequest(String data) {
        if (data.equals("second")) {
            System.out.println("second handler handleRequest");
        } else if (next != null) {
            next.handleRequest(data);
        }
    }
}
