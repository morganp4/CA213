class Exercise4 {
    public static void main(String[] args) {
        System.out.print("Please insert an integer: ");
        int input = Console.readInt();
        if(input > 0) {
            for(int i=1; i<=input; i++) {
                if(input%i==0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Sorry, I don't do negatives.");
        }
    }
}