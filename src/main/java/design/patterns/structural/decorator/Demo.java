package design.patterns.structural.decorator;

/*
The Decorator Pattern is a structural design pattern that allows you to dynamically add behavior or
responsibilities to objects without modifying their original code

Components:
 - Interface                : Defines the core behavior that both the base and decorators will implement.
 - ConcreteComponent        : Implements the default behavior
 - Decorator Abstract Class : Implements the Component interface and wraps another Component. It’s the base class for all decorators.
 - Concrete Decorators      : Each adds extra behavior before or after delegating to the wrapped component

Both ConcreteComponent and Decorator Abstract Class should implement the Interface

In our example,
 - 'Beverage' is Interface
 - Espresso is ConcreteComponent i.e. default behavior
 - CondimentDecorator is Decorator Abstract Class
 - MilkDecorator and MochaDecorator are concrete decorators

*/
public class Demo {
    public static void main(String[] args) {
        // Base drink(espresso) + Add mocha + Add milk
        Beverage beverage = new MilkDecorator(new MochaDecorator(new Espresso()));

        System.out.println(beverage.getDescription());
        System.out.println("Total: $" + beverage.cost());
    }
}
