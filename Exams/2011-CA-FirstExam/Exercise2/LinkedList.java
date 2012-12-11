class LinkedList<T> {
    private class Node<T> {
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
        if(i<0|i>numItems) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> p = head; int pIndex = 0;
        while(pIndex != i) {
            p = p.next;
            pIndex++;
        }
        return p.item;
    }
    
    public boolean add(T t) {
        Node<T> tNode = new Node<T>(t,null);
        if(tail != null) tail.next = tNode;
        else head = tNode;
        tail = tNode;
        numItems++;
        return true;
    }
    
    public void add(int i, T t) {
        if(i<0|i>numItems) {
            throw new IndexOutOfBoundsException();
        } if(i==0) {
            head = new Node<T>(t,head);
            if(tail==null) tail = head;
        } else {
            Node<T> p = head;
            int pIndex = 0;
            while(pIndex!=i-1) {
                p = p.next;
                pIndex++;
            }
            p.next = new Node<T>(t,p.next);
            if(tail==p) tail = p.next;
        }
        numItems++;    
    }
    
    public boolean contains(T t) {
        Node<T> p = head;
        while(p!=null) {
            if(p.item.equals(t)) {
                return true;
            }
            p = p.next;
        }
        return false;
    }
    
    @Override
    public String toString() {
        String result="";
        Node<T> p = head;
        while(p!=null) {
            result = result + p.item + ", ";
            p = p.next;
        }
        return "[ " + result.substring(0,result.length()-2) + " ]";
    }
}