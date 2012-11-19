class Exercise4 {
    static void writeNum(int n) {
        String w = ""+n;
        if(w.length() < 4) {
            System.out.print(w);
        } else {
            writeNum(Integer.parseInt(w.substring(0,w.length()-3)));
            System.out.print("," + w.substring(w.length()-3));
        }
    }

    public static void main(String[] args) {
        System.out.println("Type in a number:");
        int input = Console.readInt();
        writeNum(input);
        System.out.println();
    }
}