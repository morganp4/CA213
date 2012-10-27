class Rectangle extends Shape {
    private double width, height;

    Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    double area() {
        return(width*height);
    }

    double perim() {
        return((width+height)*2);
    }
}