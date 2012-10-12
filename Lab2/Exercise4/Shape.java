abstract class Shape {
    private String name;

    Shape(String name) {
        this.name = name;
    }

    abstract double area();

    abstract double perim();

    void put() {
        System.out.println(name + " with area " + area() + " and perimeter " + perim());
    }
}