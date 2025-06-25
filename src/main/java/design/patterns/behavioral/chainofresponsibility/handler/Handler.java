package design.patterns.behavioral.chainofresponsibility.handler;

public abstract class Handler {
    protected Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public abstract void handleRequest(String data);
}
