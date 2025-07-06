package design.patterns.behavioral.iterator.iterator;

import design.patterns.behavioral.iterator.TreeNode;
import java.util.Stack;

public class PreOrderIterator<T> implements Iterator<T> {
    private Stack<TreeNode<T>> stack = new Stack<>();

    public PreOrderIterator(TreeNode<T> root) {
        if (root != null) {
            stack.push(root);
        }
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public T next() {
        TreeNode<T> node = stack.pop();
        if (node.right != null) {
            stack.push(node.right);
        }
        if (node.left != null) {
            stack.push(node.left);
        }
        return node.value;
    }
}