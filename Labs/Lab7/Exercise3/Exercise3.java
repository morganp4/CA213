class Exercise3 {
    public static void main(String[] args) {
        MyLinkedList<String> items1 = new MyLinkedList<String>();
        MyLinkedList<String> items2 = new MyLinkedList<String>();
        MyLinkedList<String> items3 = new MyLinkedList<String>();
        items1.add("dog");
        items1.add("cat");
        items1.add("bat");
        
        items2.add("dog");
        items2.add("cat");
        items2.add("bat");
        
        items3.add("dog");
        items3.add("mat");
        items3.add("bat");
        
        System.out.println(items1.containsAll(items2));
        System.out.println(items1.containsAll(items3));
    }
}