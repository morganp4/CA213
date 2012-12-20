class Exercise3 {
    public static void main(String[] args) {
        TreeSet<Integer> items = new TreeSet<Integer>();
        items.add(3);
        items.add(5);
        items.add(1);
        items.add(2);
        items.add(4);
        items.add(7);
        items.add(6);
        System.out.println(items.pollFirst());
        System.out.println(items.pollFirst());
    }
}
