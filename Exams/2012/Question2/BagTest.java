class BagTest {
    public static void main(String[] args) {
        Bag names = new Bag();
        names.add("Bill");
        names.add("Bill");
        names.add("Bill");
        System.out.println(names.frequency("Bill"));
        names.remove("Bill");
        System.out.println(names.frequency("Bill"));
    }
}