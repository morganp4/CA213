import java.util.*;

class Bag {
    private HashMap<String,Integer> items = new HashMap<String,Integer>();
    
    void add(String w) {
        if(items.containsKey(w)) {
            items.put(w, (items.get(w)+1));
        } else {
            items.put(w, 1);
        }
    }
    
    int frequency(String w) {
        return items.get(w);
    }
    
    boolean remove(String w) {
        if(items.containsKey(w)) {
            items.put(w, (items.get(w)-1));
            return true;
        } else {
            return false;
        }
    }
}