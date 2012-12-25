class Circle extends Shape {
    private double radius;

    Circle(String name0, double radius0) {
        super(name0);
        radius = radius0;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    double perim() {
        return 2 * Math.PI * radius;
    }
}