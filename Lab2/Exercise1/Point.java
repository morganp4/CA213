class Point implements Printable {
    private int x;
    private int y;

    Point(int x0, int y0) {
        x = x0;
        y = y0;
    }

    public void put() {
        System.out.println("("+x+","+y+")");
    }
}