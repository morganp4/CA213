class Time implements Order {
    private int hours, mins;

    Time(int hours0, int mins0) {
        hours = hours0;
        mins = mins0;
    }

    void put() {
        System.out.printf("%02d:%02d%n",hours,mins);
    }

    @Override
    public boolean lte(Object other) {
        Time otherTime = (Time)other;
        return ((hours*60) + mins <= (otherTime.hours*60) + otherTime.mins);
    }
}