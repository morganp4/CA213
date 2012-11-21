class Exercise4 {
    static void writeNum(int n) {
        if(n < 1000) {
            System.out.print(n);
        } else {
            writeNum(n/1000);
            System.out.printf(",%03d", n%1000);
        }
    }

    public static void main(String[] args) {
        System.out.println("Type in a number:");
        int input = Console.readInt();
        writeNum(input);
        System.out.println();
    }
}