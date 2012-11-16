class Exercise3 {
    static String rev(String s) {
        if(s.length() == 0) {
            return s;
        }
        return rev(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println("Input a String to reverse");
        String input = Console.readString();
        System.out.println(rev(input));
    }
}