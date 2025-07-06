package design.patterns.behavioral.iterator;

/*
A Behavioral Design Pattern that provides a way to access elements of a collection sequentially
without exposing its underlying representation.

- It decouples collection traversal logic from the collection itself.
- Allows multiple traversals over the collection simultaneously if needed.
- Uses "Generics" heavily.

Real-World Analogy
    - Spotify Playlist: You iterate over songs in order without worrying about how songs are stored internally.
    - Tree traversals : We can have multiple iterators for multiple types of trees.

Structure (Participants)
    - Iterator (Interface) : Defines methods like hasNext(), next(), remove() (optional).
    - ConcreteIterator     : Implements the Iterator interface and keeps track of the current position.
    - Aggregate (Interface): Defines method to create an Iterator.
    - ConcreteAggregate (Collection Class): Implements createIterator() to return an iterator for the collection.
*/

import design.patterns.behavioral.iterator.iterator.Iterator;
import design.patterns.behavioral.iterator.iteratorcollection.BinaryTree;

public class Main {
    public static void main(String[] args) {
        // Create Tree:
        TreeNode<Integer> root = new TreeNode<>(10);
        root.left = new TreeNode<>(5);
        root.right = new TreeNode<>(15);
        root.left.left = new TreeNode<>(2);
        root.left.right = new TreeNode<>(7);
        root.right.left = new TreeNode<>(12);
        root.right.right = new TreeNode<>(17);

        BinaryTree<Integer> binaryTree = new BinaryTree<>(root);

        // In-Order Traversal
        System.out.println("In-Order Traversal:");
        Iterator<Integer> inOrderIterator = binaryTree.createInOrderIterator();
        while (inOrderIterator.hasNext()) {
            System.out.print(inOrderIterator.next() + " ");
        }

        System.out.println();

        // Pre-Order Traversal
        System.out.println("Pre-Order Traversal:");
        Iterator<Integer> preOrderIterator = binaryTree.createPreOrderIterator();
        while (preOrderIterator.hasNext()) {
            System.out.print(preOrderIterator.next() + " ");
        }
    }
}
