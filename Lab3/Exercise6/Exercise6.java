import java.util.*;

class Exercise6 {
    public static void main(String[] args) {
        HashMap<String,String> numbers = new HashMap<String,String>();
        while(!Console.endOfFile()) {
            String name = Console.readToken();
            String number = Console.readToken();
            if(number.equals("?")) {
                if(numbers.containsKey(name)) {
                    //System.out.println(name + "'s number is " + numbers.get(name));
                    System.out.println(numbers.get(name));
                } else {
                    System.out.println("Can't find " + name);
                }
            } else {
                numbers.put(name,number);
                //System.out.println(name + " has been added");
            }
        }
    }
}