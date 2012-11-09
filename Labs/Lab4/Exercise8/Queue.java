class Queue<T> {
    
    private static class Node<T> {
        private T item;
        private Node<T> next = null;
        
        Node(T item, Node<T> next) {
            this.item = item;
            this.next = next;
        }
    }
    
    private Node<T> head = null;
    private Node<T> tail = null;
    
    Queue() {}
    
    Queue(int n) {}
    
    boolean isEmpty() {
        return (head==null);
    }
    
    boolean enq(T t) {
        Node<T> tNode = new Node<T>(t,null);
        if(tail!=null) tail.next = tNode;
        else head = tNode;
        tail = tNode;
        return true;
    }
    
    T deq() {
        if(isEmpty()) return null;
        else {
            T temp = head.item;
            head = head.next;
            if(isEmpty()) {
                tail=null;
            }
            return temp;
        }
    }
        
}