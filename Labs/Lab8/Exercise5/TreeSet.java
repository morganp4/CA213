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

    public String toString() {
        String str = "";
        Stack<Node<T>> myNodes = new Stack<Node<T>>();
        myNodes.push(root);
        while(!myNodes.isEmpty()) {
            Node<T> p = myNodes.pop();
            if(p!=null) {
                myNodes.push(p.right);
                myNodes.push(p.left);
                str = str + p.item + ", ";
            }
        }
        return "[ " + str.substring(0,str.length()-2) + " ]";
    }
}