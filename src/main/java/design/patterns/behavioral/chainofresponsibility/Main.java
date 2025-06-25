package design.patterns.behavioral.chainofresponsibility;

import design.patterns.behavioral.chainofresponsibility.handler.*;

/*
The Chain of Responsibility Pattern is a behavioral design pattern that allows an event or request to be passed along a chain of handlers until one of them handles it.

Chain of Responsibility lets you build a chain of objects to handle a request.
Each object in the chain decides either to handle the request or pass it to the next handler in the chain.

In decorator pattern flow always passes through all wrappers but in CoR pattern the flow passes until one handles it

In the Chain of Responsibility (CoR) pattern, it's up to the developer to decide whether a handler should do some work and still forward the request to the next handler.
*/
public class Main {
    public static void main(String[] args) {
        Handler firstHandler = new FirstHandler();
        Handler secondHandler = new SecondHandler();

        firstHandler.setNext(secondHandler);
        firstHandler.handleRequest("second");
    }
}
