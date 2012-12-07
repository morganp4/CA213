class MyArrayList<T> {
    @SuppressWarnings("unchecked")
    private T[] seq = (T[])(new Object[1024]);
    private int numItems = 0;

    public int size() {
        return(numItems);
    }

    public T get(int i) {
        if(i<0||i>=numItems) throw new IndexOutOfBoundsException();
        else return seq[i];
    }

    public T set(int i, T t) {
        if(i<0||i>=numItems) throw new IndexOutOfBoundsException();
        else {
            T temp = seq[i];
            seq[i] = t;
            return t;
        }
    }

    public boolean add(T t) {
        add(numItems,t);
        return true;
    }

    public void add(int i, T t) {
        if(i<0||i>numItems) throw new IndexOutOfBoundsException();
        if(numItems==seq.length) resize();
        for(int k=numItems; k>i; k--) {
            seq[k] = seq[k-1];
        }
        seq[i] = t;
        numItems++;
    }

    public void resize() {
        @SuppressWarnings("unchecked")
        T[] temp = (T[])(new Object[seq.length*2]);
        for(int i=0; i<seq.length; i++) {
            temp[i] = seq[i];
        }
        seq = temp;
    }

    public int indexOf(Object t) {
        for(int i=0; i<numItems; i++) {
            if(seq[i]==t) return i;
        }
        return -1;
    }

    public T remove(int i) {
        if(i<0||i>numItems) throw new IndexOutOfBoundsException();
        T result = seq[i];
        numItems--;
        for(int j=i; j<numItems; j++) {
            seq[j] = seq[j+1];
        }

        return result;
    }

    public void addFirst(T t) {
        if(numItems==seq.length) resize();
        for(int i = numItems; i>0; i--) {
            seq[i] = seq[i-1];
        }
        seq[0] = t;
        numItems++;
    }

    public void printall() {
        for(int i=0; i<numItems; i++) {
            System.out.println(seq[i]);
        }
    }
}