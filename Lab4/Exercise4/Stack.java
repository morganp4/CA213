class Stack<T> {
    private Node<T> head = null;

    private static class Node<T> {
        T item;
        private Node<T> next = null;

        Node(T item, Node<T> next) {
            this.item = item;
            this.next = next;
        }
    }

    boolean push(T item) {
        head = new Node<T>(item,head);
        return true;
    }

    T pop() {
        if(isEmpty()) return null;
        else {
            T item = head.item;
            head = head.next;
            return item;
        }
    }

    boolean isEmpty() {
        return (head==null);
    }

    int size() {
        int count=0;
        Node<T> temp = head;
        while(temp!=null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}