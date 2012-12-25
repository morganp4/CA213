class Question1 {
    static void print(Printable[] items) {
        for(Printable i : items) {
            i.put();
        }
    }
    public static void main(String[] args) {
        Printable[] items = new Printable[10];
        for(int i=0; i<items.length; i++) {
            int randomDay = (int)(1+(Math.random()*30));
            int randomMonth = (int)(1+(Math.random()*12));
            int randomYear = (int)(2000+(Math.random()*13));
            items[i] = new Date(randomDay,randomMonth,randomYear);
        }
        print(items);
    }
}