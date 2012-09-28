class Exercise2 {
    public static void main(String[] args) {
        //Point[] points = {new Point(5,4), new Point(3,5), new Point(6,1), new Point(3,3)}; 
        //Time[] times = {new Time(15,10), new Time(11,5), new Time(9,20)};
        //for(Printable t : points) t.put();
        //for(Printable t : times) t.put();
        Printable[] mixed = {new Point(5,4), new Point(3,5), new Time(11,5), new Time(9,20)};
        for(Printable t : mixed) t.put();
    }
}