class Exercise2 {
    public static void main(String[] args) {
        int duplicates=0;
        LinkedList<Integer> items = new LinkedList<Integer>();
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

        System.out.println(items);
    }
}