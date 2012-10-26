class Stack<T> {
    private T[] seq;
    private int size = 0;

    Stack() {
        this(2);
    }

    Stack(int n) {
        seq = (T[])(new Object[n]);
    }

    boolean isEmpty() {
        return (size==0);
    }

    boolean push(T t) {
        if(size==seq.length) {
            T[] newSeq = (T[])(new Object[size*2]);
            System.arraycopy(seq,0,newSeq,0,size);
            seq = newSeq;
        }
        seq[size] = t;
        size++;
        return true;
    }

    T pop() {
        if(isEmpty()) return null;
        else {
            size--;
            return seq[size];
        }
    }
}