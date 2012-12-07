import java.util.*;

class MyTreeSet<T extends Comparable<T>> {
    private static class Node<T> {
        private T item;
        private Node<T> left, right;

        Node(T item0, Node<T> left0, Node<T> right0) {
            item = item0;
            left = left0;
            right = right0;
        }
    }

    private Node<T> root = null;
    private int numItems = 0;

    public int size() {
        return numItems = 0;
    }

    public boolean add(T t) {
        int numItems0 = numItems;
        root = add(root,t);
        return (numItems0<numItems);
    }
    private Node<T> add(Node<T> p, T t) {
        if (p==null) {
            numItems++;
            return new Node<T>(t,null,null);
        } else if ((p.item).compareTo(t)>0) {
            p.left = add(p.left,t);
            return p;
        } else if (t.compareTo(p.item)>0) {
            p.right = add(p.right,t);
            return p;
        } else {
            return p;
        }
    }

    public T first() {
        if(root == null) {
            throw new NoSuchElementException();
        } else {
            Node<T> p = root;
            while(p.left!=null) {
                p=p.left;
            }
            return p.item;
        }
    }

    public int height() {
        return height(root);
    }

    private int height(Node<T> p) {
        if(p == null) return 0;
        return 1 + Math.max(height(p.left), height(p.right));
    }

    ArrayList<T> breadthFirst() {
        ArrayList<T> result = new ArrayList<T>();
        Queue<Node<T>> myNodes = new Queue<Node<T>>();
        myNodes.enq(root);
        while(!myNodes.isEmpty()) {
            Node<T> p = myNodes.deq();
            if(p!=null) {
                result.add(p.item);
                myNodes.enq(p.left);
                myNodes.enq(p.right);
            }
        }
        return result;
    }
}