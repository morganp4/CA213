class Time implements Printable {
    private int hours;
    private int mins;
    
    Time(int hours0, int mins0) {
        hours = hours0;
        mins = mins0;
    }
    
    public void put() {
        System.out.printf("%02d:%02d\n",hours,mins);
    }
}