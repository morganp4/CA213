class Exercise5 {
    static boolean isProper(String exp) {
        Stack<Character> stack = new Stack<Character>();
        for(int i=0; i<exp.length(); i++) {
            char current = exp.charAt(i);

            if(current == '(' || current == '[' || current == '{') stack.push(current);
            if(!stack.isEmpty()) {
                if(current == ')' || current == ']' || current == '}') {
                    char tmp = stack.pop();
                    if(current-1 != tmp && current-2 !=tmp) stack.push(tmp);
                }
            }
        }
        return (stack.isEmpty());
    }

    public static void main(String[] args) {
        while(!Console.endOfFile()) {
            String data = Console.readToken();
            if(isProper(data)) System.out.println(data);
        }
    }
}