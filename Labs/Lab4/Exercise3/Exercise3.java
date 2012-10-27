class Exercise3 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        while(!Console.endOfFile()) {
            stack.push(Console.readToken());
        }
        while(!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }
}