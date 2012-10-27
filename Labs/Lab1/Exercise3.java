class Exercise3 {
    public static void main(String[] args) {
        int max=0, current=0;
        while(!Console.endOfFile()) {
            current = Console.readInt();
            if(current > max) max = current;
        }
        System.out.println(max);
    }
}