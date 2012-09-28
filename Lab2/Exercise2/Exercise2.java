class Exercise2 {
    public static void main(String[] args) {
        Printable[] mixed = {new Point(5,4), new Point(3,5), new Time(11,5), new Time(9,20)};
        for(Printable t : mixed) t.put();
    }
}