class Date {
    private int day, month, year;

    void get() {
        day = Console.readInt();
        month = Console.readInt();
        year = Console.readInt();
    }

    void put() {
        System.out.println(day + "/" + month + "/" + year);
    }

    boolean postDates(Date d) {
        if(this.elapsedDays() > d.elapsedDays()) return true;
        else return false;
    }

    private int elapsedDays() {
        int days = (year-1900)*365+(year-1901)/4;
        int k = 1;
        while (k<month) {
            int daysInMonth=0;
            if(k==9|k==4|k==6|k==11) {
                daysInMonth = 30;
            } else if(k==2) {
                if(year%4==0 && year!=1900) daysInMonth = 29;
                else daysInMonth = 28;
            } else daysInMonth = 31;
            days = days+daysInMonth;
            k++;
        }
        return days+day;
    }
}

class Exercise8 {
    public static void main(String[] args) {
        Date d1 = new Date();
        Date d2 = new Date();
        Date d3 = new Date();
        Date greatest = new Date();
        d1.get();
        d2.get();
        d3.get();
        if(d1.postDates(d2)) greatest = d1;
        else greatest = d2;
        if(d3.postDates(greatest)) greatest = d3;
        greatest.put();
    }
}