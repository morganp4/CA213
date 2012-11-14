class Exercise5 {
    static boolean isPalindrome(String w) {
        if(w.length() < 2) {
            return true;
        }
        if(w.charAt(0) == w.charAt(w.length()-1)) {
            return isPalindrome(w.substring(1,w.length()-1));
        }
        return false;
    }

    public static void main(String[] args) {
        String word = "navan";
        if(isPalindrome(word)) {
            System.out.println(word + " is palindrome");
        } else {
            System.out.println(word + " is not palindrome");
        }
    }
}