abstract class Shape {
    private String name;

    Shape(String name0) {
        name = name0;
    }

    abstract double area();
    abstract double perim();

    void put() {
        System.out.println(name + " with area " + area() + " and perimeter " + perim());
    }
}