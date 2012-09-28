class Exercise5 {
    public static void main(String[] args) {
        int[] words = new int[18];
        while(!Console.endOfFile()) {
            String word = Console.readToken();
            words[word.length()]++;
        }
        for(int i=0; i<words.length; i++) {
            if(words[i] > 0) {
                System.out.println(i + "-letter words: " + words[i]);
            }
        }
    }
}