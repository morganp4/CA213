import java.util.Iterator;
import java.util.NoSuchElementException;

class MyLinkedList<T> {

    private static class Node<T> {
        private T item;
        private Node<T> next;
        Node(T item0, Node<T> next0) {
            item = item0;
            next = next0;
        }
    }

    private Node<T> head = null;
    private Node<T> tail = null;
    private int numItems = 0;

    public int size() {
        return numItems;
    }

    public T get(int i) {
        if(i<0||i>numItems) throw new IndexOutOfBoundsException();
        Node<T> p = head;
        int pIndex = 0;
        while(pIndex!=i) {
            p = p.next;
            pIndex++;
        }
        return p.item;
    }

    public boolean add(T t) {
        Node<T> tNode = new Node<T>(t,null);
        if(tail!=null) {
            tail.next = tNode;
        } else {
            head = tNode;
        }
        tail = tNode;
        numItems++;
        return true;
    }

    public void add(int i, T t) {
        if(i<0||i>numItems) throw new IndexOutOfBoundsException();
        if(i==0) {
            head = new Node<T>(t,head);
        } else {
            Node<T> p = head;
            int pIndex = 0;
            while(pIndex != i - 1) {
                p=p.next;
                pIndex++;
            }
            p.next = new Node<T>(t,p.next);
            if(tail==p) {
                tail = p.next;
            }
        }
        numItems++;
    }

    public int indexOf(Object t) {
        Node<T> p = head;
        int pIndex = 0;
        while(p != null) {
            if(p.item.equals(t)) return pIndex;
            p = p.next;
            pIndex++;
        }
        return -1;
    }

    void addFirst(T t) {
        Node<T> tNode = new Node<T>(t,null);
        if(head==null) {
            head = tNode;
            tail = tNode;
        } else {
            tNode.next = head;
            head = tNode;
        }
        numItems++;
    }

    T removeLast() {
        if(head==null) {
            throw new NoSuchElementException();
        }
        T result = tail.item;
        tail = tail.next;
        if(tail == null) {
            head = null;
        } else {
            tail.next = null;
        }
        return result;
    }
}