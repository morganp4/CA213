import java.util.*;

class TreeSet<T extends Comparable<T>> {
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

    public int count(T lo, T hi) {
        return count(root,lo,hi);
    }

    private int count(Node<T> p, T lo, T hi) {
        if(p == null) {
            return 0;
        } else if(hi.compareTo(p.item) > 0 && lo.compareTo(p.item) < 0) {
            return 1 + count(p.left,lo,hi) + count(p.right,lo,hi);
        }
        return count(p.left,lo,hi) + count(p.right,lo,hi);
    }
}