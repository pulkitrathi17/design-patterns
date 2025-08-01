package design.patterns.creational.singleton;

/*
Why this is best:
 - Thread-safe without synchronization overhead.
 - Lazy-loaded: Instance created only when needed.
 - Uses Java ClassLoader mechanism to ensure safe initialization.
 - No need for synchronized, volatile, or complex double-checked logic.


Why this worked:
 - The SingletonSimpleUtilClass class is not loaded into memory until it's first accessed.
 - When you call getInstance(), SingletonSimpleUtilClass.INSTANCE is referenced, so Java loads and initializes SingletonSimpleUtilClass.
 - Class loading in Java is lazy and done only once per classloader.
 - Java guarantees class initialization is thread-safe — only one thread can load and initialize a class at a time.
 - So, even in multithreaded environments, only one instance of the Singleton is created — without needing synchronized or volatile keywords.
 - getInstance() is static as this way we won't need an instance of SingletonClass already to create one


Properties to keep in mind:
 - Classes (including static nested classes) in Java are loaded lazily by the JVM, i.e., only when they are first used
 - A static nested class is just like a top-level class scoped inside another class. It does not get loaded when the outer class is loaded.
 - You cannot declare static fields or methods in non-static inner classes (that's why INSTANCE is static)
*/



public class SingletonSimpleClass {
    // Private constructor
    private SingletonSimpleClass() {}

    // Static nested class – loaded only when getInstance() is called. Makes lazy loading possible
    private static class SingletonSimpleUtilClass {
        private static final SingletonSimpleClass INSTANCE = new SingletonSimpleClass();
    }

    public static SingletonSimpleClass getInstance() {
        return SingletonSimpleUtilClass.INSTANCE;
    }
}
