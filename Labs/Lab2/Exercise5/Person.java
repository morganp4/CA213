abstract class Person {
    private String name, address;
    private boolean sex;

    Person(String name, String address, boolean sex) {
        this.name = name;
        this.address = address;
        this.sex = sex;
    }

    abstract int completionYear();

    void put() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.print("Sex: ");
        if(sex) System.out.println("Male");
        else System.out.println("Female");
        System.out.println("Completion Year: " + completionYear());
    }
}