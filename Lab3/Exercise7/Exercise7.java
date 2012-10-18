import java.util.*;

class Exercise7 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> words = new HashMap<Integer,Integer>();
        while(!Console.endOfFile()) {
            String word = Console.readToken();
            int length = word.length();
            if(!words.containsKey(length)) {
                words.put(length, 1);
            } else {
                words.put(length, (words.get(length)+1));
            }
        }
        System.out.printf("%-15s%s%n", "Word Length", "Frequency");
        Set<Integer> lengths = words.keySet();
        for(int length : lengths) {
            System.out.printf("%5s%15s%n", length, words.get(length));
        }
    }
}