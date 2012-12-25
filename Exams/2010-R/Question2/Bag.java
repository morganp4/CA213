class Bag<T> {
    private T[] stack;
    private int numItems;

    @SuppressWarnings("unchecked")
    Bag () {
        stack = (T[])(new Object[100]);
    }

    void add(T x) {
        stack[numItems] = x;
        numItems++;
    }

    int freq(T x) {
        int count=0;
        for(int i=0; i<numItems; i++) {
            if(stack[i].equals(x)) {
                count++;
            }
        }
        return count;
    }
}