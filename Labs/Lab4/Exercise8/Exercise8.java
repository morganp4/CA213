class Exercise8 {
    public static void main(String[] args) {
        Queue<String> queue = new Queue<String>();
        while(!Console.endOfFile()) {
            queue.enq(Console.readToken());
        }
        while(!queue.isEmpty()) {
            System.out.print(queue.deq() + " ");
        }
        System.out.println();
    }
}