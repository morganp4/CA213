class Exercise6 {
    public static void main(String[] args) {
        Secrets secrets = new Secrets();
        Stack<String> stack = new Stack<String>();
        stack.push("");
        while( !stack.isEmpty()) {
            String w = stack.pop();
            if(secrets.has(w))
                System.out.println(w);
            for(char ch='z'; ch>='a'; ch--) {
                if(secrets.hasPrefix(w+ch))
                    stack.push(w+ch);
            }
        }
    }
}