class Exercise1 {
    public static void main(String[] args) {
        TreeSet<Integer> items = new TreeSet<Integer>();
        items.add(3);
        items.add(5);
        items.add(1);
        items.add(4);
        items.add(2);
        System.out.println(items.first());
    }
}