package design.patterns.behavioral.chainofresponsibility.handler;

public class FirstHandler extends Handler {
    @Override
    public void handleRequest(String data) {
        if (data.equals("first")) {
            System.out.println("First handler handleRequest");
        } else if (next != null) {
            next.handleRequest(data);
        }
    }
}
