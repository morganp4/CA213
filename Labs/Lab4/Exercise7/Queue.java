class Queue<T> {

    T[] seq;
    private int size = 0;
    private int head = 0;
    private int tail = 0;

    @SuppressWarnings("unchecked")
    Queue(int n) {
        seq = (T[])(new Object[n]);
    }

    Queue() {
        this(2);
    }

    boolean isEmpty() {
        return size==0;
    }

    boolean enq(T t) {
        if (size==seq.length) {
            @SuppressWarnings("unchecked")
            T[] newSeq = (T[])(new Object[seq.length*2]);
            if(head < tail) {
                System.arraycopy(seq,head,newSeq,0,head-tail);
            } else {
                System.arraycopy(seq,head,newSeq,0,seq.length-head);
                System.arraycopy(seq,0,newSeq,seq.length-head,tail);
            }
            head=0;
            tail=seq.length;
            seq = newSeq;
        }
        seq[tail] = t;
        tail = (tail+1)%seq.length;
        size++;
        return true;
    }

    T deq() {
        if (isEmpty()) return null;
        else {
            T temp = seq[head];
            head = (head+1)%seq.length;
            size--;
            return temp;
        }
    }

}