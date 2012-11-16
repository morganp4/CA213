class Print {
    static void print(Printable[] items) {
        for(Printable item : items) {
            item.put();
        }
    }

    public static void main(String[] args) {
        Printable[] items = new Printable[20];
        for(int i=0; i<items.length; i++) {
            items[i] = new Date((int)(1+Math.random()*29),(int)(1+Math.random()*12),(int)(2000+Math.random()*100));
        }
        print(items);
    }
}