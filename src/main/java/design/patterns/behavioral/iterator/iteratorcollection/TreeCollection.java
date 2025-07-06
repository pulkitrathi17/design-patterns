package design.patterns.behavioral.iterator.iteratorcollection;

import design.patterns.behavioral.iterator.iterator.Iterator;

public interface TreeCollection<T> {
    Iterator<T> createInOrderIterator();
    Iterator<T> createPreOrderIterator();
}