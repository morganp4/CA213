class Exercise4 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        while(!Console.endOfFile()) {
            stack.push(Console.readToken());
        }
        System.out.println(stack.size());
        while(!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }
}