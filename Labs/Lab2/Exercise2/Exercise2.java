class Exercise2 {

    static void sort(Order[] w) {
        final int n = w.length;
        int j = 0;
        while(j<n-1) {
            int min = j;
            int i = j+1;
            while(i<n) {
                if(w[i].lte(w[min])) {
                    min = i;
                }
                i++;
            }
            Order temp = w[j];
            w[j] = w[min];
            w[min] = temp;
            j++;
        }
    }

    public static void main(String[] args) {
        Triangle[] ts = new Triangle[3];
        System.out.println("Enter " + ts.length + " triangles:");
        for(int i=0; i<ts.length; i++) {
            ts[i] = new Triangle();
            ts[i].get();
        }
        sort(ts);
        for(Triangle t : ts) {
            System.out.println(t);
        }
    }
}