import java.util.*;

class Exercise2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        while(!Console.endOfFile()) {
            int number = Console.readInt();
            numbers.add(number);
        }
        Collections.sort(numbers);
        for(int i : numbers) System.out.println(i);
    }
}