class Queue<T> {
    private static class Node<T> {
        private T item;
        private Node<T> next = null;

        Node(T item0, Node<T> next0) {
            item = item0;
            next = next0;
        }
    }

    private Node<T> head = null;
    private Node<T> tail = null;

    boolean isEmpty() {
        return (head==null);
    }

    boolean enq(T t) {
        Node<T> tNode = new Node<T>(t,null);
        if(tail!=null) {
            tail.next = tNode;
        } else {
            head = tNode;
        }
        tail = tNode;
        return true;
    }

    boolean deq() {
        if(isEmpty()) return null;
        else {
            T temp = head.item;
            head = head.next;
            if(isEmpty()) {
                tail = null;
            }
            return temp;
        }
    }
}