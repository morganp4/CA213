class Exercise2 {
    public static void main(String[] args) {
        MyLinkedList<String> items = new MyLinkedList<String>();
        items.add("dog");
        items.add("cat");
        items.add("bat");
        System.out.println(items.removeLast());
    }
}