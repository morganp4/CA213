class Exercise6 {
    static void writeRev(String[] s, int n) {
        if(n < -1) {
            System.out.println(s[n]);
        } else if(n > -1) {
            System.out.println(s[n]);
            writeRev(s, --n);
        }
    }
    public static void main(String[] args) {
        String[] words = {"first","second","third","forth","fifth"};
        writeRev(words,3);
    }
}