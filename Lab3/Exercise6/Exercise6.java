import java.util.*;

class Exercise6 {
    public static void main(String[] args) {
        TreeMap<String,Integer> data = new TreeMap<String,Integer>();
        while(!Console.endOfFile()) {
            String club = Console.readToken();
            int points = Console.readInt();
            data.put(club, points);
        }
        Set<String> clubs = data.keySet();
        for(String club : clubs) System.out.println(club + " " + data.get(club));
    }
}