class StringSet {
    private static class Node {
        private String item;
        private Node next=null;

        Node(String item0, Node next0) {
            item = item0;
            next = next0;
        }
    }
    private Node head = null;
    private int numItems;

    int size() {
        return numItems;
    }

    void add(String s) {
        if(!contains(s)) {
            Node tNode = new Node(s,null);
            if(head == null) {
                head=tNode;
            } else {
                tNode.next = head;
                head = tNode;
            }
            numItems++;
        }
    }

    void remove(String s) {
        Node p = head;
        Node parent = null;
        while(p!=null) {
            if(s.equals(p.item)) {
                if(p.equals(head)) {
                    head = head.next;
                } else if(p.next!=null) {
                    parent.next = p.next;
                } else {
                    parent.next = null;
                }
                numItems--;
            }
            parent = p;
            p = p.next;
        }
    }

    boolean contains(String s) {
        Node p = head;
        while(p!=null) {
            if(s.equals(p.item)) return true;
            p = p.next;
        }
        return false;
    }

    void put() {
        Node p = head;
        while(p!=null) {
            System.out.print(p.item + " ");
            p = p.next;
        }
    }
}

class StringSetTest {
    public static void main(String[] args) {
        StringSet ws = new StringSet();
        // Test add()
        ws.add("pig");
        ws.add("dog");
        ws.add("cow");
        ws.add("cat");
        // Test size
        System.out.print("Set has "+ws.size()+" elements: ");
        // Test put()
        ws.put();
        System.out.println();
        // Test contains() (uses add())
        ws.add("cow");
        ws.add("ant");
        if (ws.contains("ant"))
            System.out.println("Set contains ant");
        else
            System.out.println("Set does not contain ant");
        if (ws.contains("goat"))
            System.out.println("Set contains goat");
        else
            System.out.println("Set does not contain goat");
        // Test remove() (uses size(), put())
        ws.remove("ant");
        ws.remove("pig");
        ws.remove("cow");
        ws.remove("pig");
        System.out.print("Set has "+ws.size()+" elements: ");
        ws.put();
        System.out.println();
        ws.remove("cat");
        ws.remove("cow");
        ws.remove("dog");
        ws.remove("dog");
        System.out.print("Set has "+ws.size()+" elements: ");
        ws.put();
    }
}