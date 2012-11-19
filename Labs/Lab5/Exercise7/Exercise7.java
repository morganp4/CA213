class Exercise7 {
    static Secrets secrets = new Secrets();

    static void listWords(String s) {
        if(secrets.has(s)) {
            System.out.println(s);
        }
        for(char ch='a'; ch<='z'; ch++) {
            if(secrets.hasPrefix(s+ch)) {
                listWords(s+ch);
            }
        }
    }

    public static void main(String[] args) {
        listWords("");
    }
}