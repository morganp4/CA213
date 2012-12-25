class BagTest {
    public static void main(String[] args) {
        Bag items = new Bag();
        System.out.println("Adding a cat to the bag");
        items.add("cat");
        System.out.println("Adding another cat to the bag");
        items.add("cat");
        System.out.println("Adding another cat to the bag");
        items.add("cat");
        System.out.println("There are now " + items.frequency("cat") + " cats in the bag");
        System.out.print("Removing a cat from the bag: ");
        if(items.remove("cat")) {
            System.out.println("Success");
        } else {
            System.out.println("Fail");
        }
        System.out.println("There are now " + items.frequency("cat") + " cats in the bag");
        System.out.print("Removing a cat from the bag: ");
        if(items.remove("cat")) {
            System.out.println("Success");
        } else {
            System.out.println("Fail");
        }
        System.out.println("There are now " + items.frequency("cat") + " cats in the bag");
        System.out.print("Removing a cat from the bag: ");
        if(items.remove("cat")) {
            System.out.println("Success");
        } else {
            System.out.println("Fail");
        }
        System.out.println("There are now " + items.frequency("cat") + " cats in the bag");
        System.out.print("Removing a cat from the bag: ");
        if(items.remove("cat")) {
            System.out.println("Success");
        } else {
            System.out.println("Fail");
        }
        System.out.println("There are now " + items.frequency("cat") + " cats in the bag");
    }
}