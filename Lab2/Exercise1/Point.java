class Point implements Order {
    private double x,y;

    Point() {}

    Point(double x0, double y0) {
        x = x0;
        y = y0;
    }

    void get() {
        x = Console.readDouble();
        y = Console.readDouble();
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public boolean lte(Object obj) {
        if(obj==null) return false;
        Point p = (Point)obj;
        return (x<p.x || (x==p.x && y < p.y));
    }

    double distance(Point r) {
        double xdist = x-r.x;
        double ydist = y-r.y;
        return(Math.sqrt((xdist*xdist)+(ydist*ydist)));
    }
}