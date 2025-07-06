package design.patterns.behavioral.iterator.iteratorcollection;

import design.patterns.behavioral.iterator.*;
import design.patterns.behavioral.iterator.iterator.*;

// Naming this Binary Tree but not implementing any checks for now to make example simple
public class BinaryTree<T> implements TreeCollection<T> {
    TreeNode<T> root;

    public BinaryTree(TreeNode<T> root) {
        this.root = root;
    }

    @Override
    public Iterator<T> createInOrderIterator() {
        return new InOrderIterator<>(root);
    }

    @Override
    public Iterator<T> createPreOrderIterator() {
        return new PreOrderIterator<>(root);
    }
}