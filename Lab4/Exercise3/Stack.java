import java.util.*;

class Stack<T> {
    private ArrayList<T> Items = new ArrayList<T>();
    private int size=0;

    boolean isEmpty() {
        return (size==0);
    }

    boolean push (T item) {
        size++;
        return(Items.add(item));
    }

    T pop() {
        size--;
        return(Items.get(size));
    }

}