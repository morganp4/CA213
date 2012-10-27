class Time {
    private int time;

    void get() {
        time = Console.readInt();
    }

    boolean gt(Time t2) {
        return time > t2.time;
    }
}

class Period {
    private Time t1 = new Time();
    private Time t2 = new Time();

    void get() {
        t1.get();
        t2.get();
    }

    boolean overlaps(Period p2) {
        if(t2.gt(p2.t1) && p2.t2.gt(t1)) return true;
        else return false;
    }
}

class Exercise10 {
    public static void main(String[] args) {
        System.out.println("Enter two periods");
        Period p1 = new Period();
        p1.get();
        Period p2 = new Period();
        p2.get();
        if(p1.overlaps(p2)) System.out.println("They overlap");
        else System.out.println("They do not overlap");
    }
}