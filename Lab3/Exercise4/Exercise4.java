import java.util.*;

class Exercise4 {
    public static void main(String[] args) {
        HashSet<String> words = new HashSet<String>();
        while(!Console.endOfFile()) {
            String input = Console.readToken();
            if(!words.contains(input)) {
                words.add(input);
                System.out.println("First occurence");
            } else {
                System.out.println("Occurred previously");
            }
        }
    }
}