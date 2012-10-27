class Exercise9 {
    static void printLines(Object[] objects) {
        for(Object object : objects) {
            System.out.println(object);
        }
    }

    public static void main(String[] args) {
        String[] names = {"Pete","Jill","May","Anne","Tim"};
        printLines(names);

        Integer[] ints = {7,3,6,5};
        printLines(ints);
    }
}