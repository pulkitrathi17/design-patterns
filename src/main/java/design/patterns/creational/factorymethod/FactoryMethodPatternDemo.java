package design.patterns.creational.factorymethod;

import design.patterns.creational.factorymethod.shop.AsusShop;
import design.patterns.creational.factorymethod.shop.MsiShop;
import design.patterns.creational.factorymethod.shop.Shop;

/*

Factory Method Pattern is a creational design pattern that:
 - Defines an interface for creating an object, but lets subclasses decide which class to instantiate.

In short:
 - It encapsulates object creation logic.
 - It allows a class to defer instantiation to subclasses.

         ┌────────────────────────┐
         │      Product           │◄──────────────┐
         │ (interface / abstract) │               │
         └────────────────────────┘               │
                    ▲                             ▲
     ┌──────────────┴──────────────┐    ┌─────────┴─────────┐
     │     ConcreteProductA        │    │  ConcreteProductB │
     └─────────────────────────────┘    └───────────────────┘

              Created by                          Created by

         ┌────────────────────────────┐
         │      Creator               │◄──────────────┐
         │(abstract class / interface)│               │
         │ + factoryMethod(): Product │               │
         └────────────────────────────┘               │
                    ▲                                 ▲
     ┌──────────────┴────────────────┐  ┌─────────────┴─────────────┐
     │    ConcreteCreatorA           │  │     ConcreteCreatorB      │
     │ + factoryMethod(): Product    │  │ + factoryMethod(): Product│
     └───────────────────────────────┘  └───────────────────────────┘


| Step | What You Do                         | Why You Do It                                             |
| ---- | ----------------------------------- | --------------------------------------------------------- |
| 1    | Define a `Product` interface/class  | To abstract the object being created                      |
| 2    | Create concrete implementations     | To provide specific product behavior                      |
| 3    | Define `Creator` abstract class     | To declare the factory method, possibly with shared logic |
| 4    | Create `ConcreteCreator` subclasses | To implement `factoryMethod()` and choose which product   |
| 5    | Use creator in client code          | To decouple client from product construction logic        |

*/


public class FactoryMethodPatternDemo {
  public static void main(String[] args){
    Shop msiShop = new MsiShop();
    msiShop.assembleGpu();

    Shop asusShop = new AsusShop();
    asusShop.assembleGpu();
  }
}
