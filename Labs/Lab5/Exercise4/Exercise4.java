class Exercise4 {
    static String writeNum(int n) {
        if(n < 1000) {
            return "" + n;
        }
        return "" + (writeNum(n/1000) + "," + (n%1000));
    }

    public static void main(String[] args) {
        System.out.println("Type in a number:");
        int input = Console.readInt();
        System.out.println(writeNum(input));
    }
}