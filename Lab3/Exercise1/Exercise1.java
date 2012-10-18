import java.util.*;

class Exercise1 {
    public static void main(String[] args) {
        ArrayList<Integer> odd = new ArrayList<Integer>();
        ArrayList<Integer> even = new ArrayList<Integer>();
        while(!Console.endOfFile()) {
            int number = Console.readInt();
            if(number%2==0) {
                even.add(number);
            } else {
                odd.add(number);
            }
        }
        for(int evenNumber : even) System.out.print(evenNumber + " ");
        System.out.println();
        for(int oddNumber : odd) System.out.print(oddNumber + " ");
        System.out.println();
    }
}