class Queue<T> { // bounded

    T[] seq; // the sequence
    private int size = 0; // size of sequence
    private int head = 0;
    private int tail = 0; // front and rear

    Queue(int n) { // n>0
        seq = (T[])(new Object[n]);
    }

    Queue() {
        this(3);   // =
    }

    boolean isEmpty() {
        return size==0;
    }

    boolean enq(T t) {
        if (!(size<seq.length)) {
            int oldLen = seq.length;
            T[] newSeq = (T[])(new Object[oldLen*2]);
            if(head < tail) {
                System.arraycopy(seq,head,newSeq,0,head-tail);
            } else {
                System.arraycopy(seq,head,newSeq,0,oldLen-head);
                System.arraycopy(seq,0,newSeq,oldLen-head,tail);
            }
            head=0;
            tail=oldLen;
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