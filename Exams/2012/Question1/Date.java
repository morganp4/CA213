class Date implements Printable {
    private int day,month,year;
    
    Date() { }
    
    Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    void get() {
        this.day = Console.readInt();
        this.month = Console.readInt();
        this.year = Console.readInt();
    }
    
    public void put() {
        System.out.println(day + "/" + month + "/" + year);
    }
}