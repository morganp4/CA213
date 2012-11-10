class Exercise8 {
    public static void main(String[] args) {
        Queue<String> queue = new Queue<String>();
        queue.enq("first");
        queue.enq("second");
        queue.enq("third");
        queue.deq();
        queue.deq();
        queue.enq("forth");

        while(!queue.isEmpty()) {
            System.out.println(queue.deq());
        }
    }
}