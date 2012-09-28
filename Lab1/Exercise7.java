class Exercise7 {
    static int sumFacs (int n) {
        int total=0;
        for(int i=1; i<n; i++) {
            if(n%i==0) total=total+i;
        }
        return total;
    }
    static boolean isPerfect(int n) {
        if(n == sumFacs(n)) return true;
        else return false;
    }

    public static void main(String[] args) {
        for(int i=1; i<1000; i++) {
            if(isPerfect(i)) {
                System.out.println(i);
            }
        }
    }
}