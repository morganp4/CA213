class Circle extends Shape {
    private double radius;

    Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    double area() {
        return((22/7) * (radius * radius));
    }

    double perim() {
        return(2 * (22/7) * radius);
    }
}