package design.patterns.creational.singleton;

public class SingletonPatternDemo {
  public static void main(String args[]){
    // will print object instantiation log only once
    SingletonClass s1 = SingletonClass.getInstance();
    SingletonClass s2 = SingletonClass.getInstance();
    System.out.println(s1 == s2);
  }
}

/*
Use for a Singleton Class
- When we only want a single instance exists for a class. For example, we don't want multiple instance of database class.


Steps to make a class Singleton

1. Use "volatile" keyword when declaring class instance to always read from and write to the main memory, bypassing thread-local caches.
    Guarantees that no other thread ever sees a partially constructed object
2. Make class instance "static" so that getInstance() static method can initialize it
3. Make constructor private so that no one can accidentally create new instance via constructor
4. Use "synchronized" keyword to make initialization thread safe
5. Use double locking to make null checking efficient

OR

1. Use Private constructor in Singleton class
2. Create a nested static util class with final static Singleton class object and initialize it using new keyword
3. Create a getInstance method that returns the Singleton class object from nested static util class
*/