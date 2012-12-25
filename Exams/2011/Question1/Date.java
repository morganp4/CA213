class Date implements Printable {
    private int day, month, year;

    Date() {
        //default constructor
    }

    Date(int day0, int month0, int year0) {
        day = day0;
        month = month0;
        year = year0;
    }

    void get() {
        day = Console.readInt();
        month = Console.readInt();
        year = Console.readInt();
    }

    boolean lte(Date other) {
        if(year < other.year) {
            return true;
        } else if((month < other.month) && (year <= other.year)) {
            return true;
        } else if((day < other.day) && (month <= other.month) &&
                  (year <= other.year)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void put() {
        System.out.println(day + "/" + month + "/" + year);
    }
}