import java.util.*;

class Stack<T> {
    private ArrayList<T> stack;
    
    Stack() {
        stack = new ArrayList<T>();
    }
    
    boolean push(T item) {
        return(stack.add(item));
    }

    T pop() {
        if(!isEmpty()) {
            return(stack.remove(stack.size()-1));
        } else {
            return null;
        } 
    }

    boolean isEmpty() {
        return (stack.size()==0);
    }
}