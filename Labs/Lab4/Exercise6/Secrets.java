//
// Slightly modified to run on Java 6
//

import java.util.HashSet;
import java.util.Iterator;

class Secrets {
    Secrets() {
        words = new HashSet<String>();
        words.add("cats");
        words.add("cat");
        words.add("zoology");
        words.add("ant");
        words.add("ants");
        words.add("dog");
        words.add("doggerel");
        words.add("catapult");
        words.add("catapults");
        words.add("zoos");
        words.add("dogsbody");
    }

    boolean hasPrefix(String s) {
        for(Iterator iterator = words.iterator(); iterator.hasNext();) {
            String s1 = (String)iterator.next();
            if(s1.startsWith(s))
                return true;
        }

        return false;
    }

    boolean has(String s) {
        return words.contains(s);
    }

    private HashSet<String> words;
}
