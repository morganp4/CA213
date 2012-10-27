class Triangle implements Order {
    private Point v1 = new Point();
    private Point v2 = new Point();
    private Point v3 = new Point();

    void get() {
        v1.get();
        v2.get();
        v3.get();
    }

    public String toString() {
        return v1 + "-" + v2 + "-" + v3;
    }

    public boolean lte(Object obj) {
        if(obj==null) return false;
        Triangle t = (Triangle)obj;
        return (area() < t.area());
    }


    double area() {
        double a = v1.distance(v2);
        double b = v2.distance(v3);
        double c = v3.distance(v1);
        double s = (a+b+c)/2;
        //System.out.println(s);
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}