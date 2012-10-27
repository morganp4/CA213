class Point {
    private double x,y;

    Point() { }

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

    Point midPoint(Point p2) {
        return new Point((x+p2.x)/2 , (y+p2.y)/2);
    }
}

class Exercise9 {
    public static void main(String[] args) {
        Point p1 = new Point(2.1,3.2);
        Point p2 = new Point(3.0,2.8);
        System.out.println(p1.midPoint(p2));
    }
}