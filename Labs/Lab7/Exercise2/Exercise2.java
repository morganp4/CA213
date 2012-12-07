class Exercise2 {
    public static void main(String[] args) {
        MyTreeSet<Integer> items = new MyTreeSet<Integer>();
        items.add(3);
        items.add(5);
        items.add(2); 
        items.add(1);
        items.add(4);
        items.add(7);
        items.add(6);
        System.out.println(items.height());
    }
}