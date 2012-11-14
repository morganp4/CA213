class Exercise4 {
    static String writeNum(String n) {
        if(n.length() < 4) {
            return n;
        }
        return writeNum(n.substring(0,n.length()-3)) + "," + n.substring(n.length()-3);
    }

    public static void main(String[] args) {
        System.out.println(writeNum("1234567"));
    }
}