class Exercise2 {
    static int sum(int n) {
        if(n < 10) {
            return n;
        } else {
            return sum(n/10) + n % 10;
        }
    }

    public static void main(String[] args) {
        System.out.println(sum(256));
    }
}