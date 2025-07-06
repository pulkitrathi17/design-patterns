package design.patterns.behavioral.strategy;

/*
A Behavioral Design Pattern that enables selecting an algorithm’s behavior at runtime by encapsulating
interchangeable algorithms (strategies) in separate classes and making them interchangeable within the context.

Real-World Analogy: Payment Processing in E-commerce. Strategy: Credit Card Payment, PayPal Payment, Crypto Payment.

Structure (Participants)
    - Strategy (Interface/Abstract Class): Defines a common interface for all supported algorithms.
    - Concrete Strategies                : Implement different versions of the algorithm.
    - Context                            : Holds a reference to a Strategy object and delegates the behavior to the strategy.
*/

import design.patterns.behavioral.strategy.strategy.CreditCardPayment;
import design.patterns.behavioral.strategy.strategy.PayPalPayment;
import design.patterns.behavioral.strategy.strategy.PaymentStrategy;

public class Main {
    public static void main(String[] args) {
        PaymentStrategy creditCardStrategy = new CreditCardPayment();
        PaymentStrategy paypalStrategy = new PayPalPayment();

        ShoppingCart shoppingCart = new ShoppingCart(creditCardStrategy);
        shoppingCart.checkout(50);

        shoppingCart.setPaymentStrategy(paypalStrategy);
        shoppingCart.checkout(100);
    }
}
