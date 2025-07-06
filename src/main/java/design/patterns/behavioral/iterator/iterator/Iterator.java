package design.patterns.behavioral.iterator.iterator;

public interface Iterator<T> {
    boolean hasNext();
    T next();
}
