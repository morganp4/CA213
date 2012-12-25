class Question1 {
    static void sort(Order[] w) {
        final int n = w.length;
        int j = 0;
        while(j<n-1) {
            int min = j;
            int i = j+1;
            while(i<n) {
                if(w[i].lte(w[min])) min = i;
                i++;
            }
            Order temp = w[j];
            w[j] = w[min];
            w[min] = temp;
            j++;
        }
    }

    public static void main(String[] args) {
        Order[] times = new Order[10];
        for(int i=0; i<times.length; i++) {
            int hours = (int)(Math.random()*23);
            int mins = (int)(Math.random()*60);
            times[i] = new Time(hours,mins);
        }
        sort(times);
        for(Order i : times) {
            Time time = (Time)i;
            time.put();
        }
    }
}