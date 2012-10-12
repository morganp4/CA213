class Exercise4 {
    public static void main(String[] args) {
        Shape[] figures = {new Rectangle("Rectangle",2.0,3.0), new Rectangle("Square",4.0,4.0), new Circle("Circle",2.0)};

        for(Shape s : figures) {
            s.put();
        }
    }
}