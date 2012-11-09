class Exercise6 {
    public static void main(String[] args) {
        Secrets secrets = new Secrets();
        Stack<String> stack = new Stack<String>();
        String w = "";

        while( secrets.hasPrefix(w) || !stack.isEmpty()) {
            if(secrets.hasPrefix(w)) {
                for(char ch='z'; ch>='a'; ch--) {
                    stack.push(w+ch);
                }
            }
            w = stack.pop();
            if(secrets.has(w)) {
                System.out.println(w);
            }
        }
    }
}