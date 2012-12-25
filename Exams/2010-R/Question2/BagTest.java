class BagTest {
    public static void main(String[] args) {
        Bag<String> items = new Bag<String>();
        for(int i=0; i<100; i++) {
            String randomLetter = ""+(char)(65+(Math.random()*26));
            items.add(randomLetter);
        }
        for(int i=65; i<=65+25; i++) {
            String letter = ""+(char)(i);
            System.out.println(letter+" occurs " + items.freq(letter) + " times");
        }
    }
}