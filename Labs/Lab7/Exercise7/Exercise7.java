class Exercise7 {
    public static void main(String[] args) {
        MyTreeSet<Integer> items = new MyTreeSet<Integer>();
        items.add(3);
        items.add(5);
        items.add(2); 
        items.add(1);
        items.add(4);
        items.add(7);
        items.add(6);
        for(int i : items.breadthFirst()) {
            System.out.println(i);
        }
    }
}