class Exercise9 {
    public static void main(String[] args) {
        Queue<String> queue = new Queue<String>();
        queue.enq("first");
        queue.enq("second");
        queue.deq();
        queue.enq("third");
        queue.enq("forth");

        System.out.println(queue.size());

        while(!queue.isEmpty()) {
            System.out.println(queue.deq());
        }
    }
}