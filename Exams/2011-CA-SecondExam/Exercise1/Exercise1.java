import java.util.HashSet;

class Exercise1 {
    public static void main(String[] args) {
        int duplicates=0;
        HashSet<Integer> items = new HashSet<Integer>();
        while(!Console.endOfFile()) {
            int input = Console.readInt();
            if(items.contains(input)) {
                duplicates++;
            } else {
                items.add(input);
            }
        }

        for(int i=0; i<items.size(); i++) {
            if(!items.contains(i)) {
                System.out.println(i);
                break;
            }
        }
        System.out.println("There were " + duplicates + " duplicates inputted");
    }
}