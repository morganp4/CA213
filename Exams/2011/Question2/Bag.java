import java.util.*;

class Bag {
    private Map<String,Integer> map = new HashMap<String,Integer>();

    void add(String w) {
        int frequency = frequency(w);
        map.put(w,++frequency);
    }

    int frequency(String w) {
        if(map.containsKey(w)) {
            return map.get(w);
        } else {
            return 0;
        }
    }

    boolean remove(String w) {
        int frequency = frequency(w);
        if(frequency == 0) {
            return false;
        } else {
            map.put(w,--frequency);
            return true;
        }
    }
}