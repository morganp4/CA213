class Exercise5 {
    public static void main(String[] args) {
        Person[] people = {
            new Student("Mike Smith","10 Main St", true,"5023765", "Computing", 2),
            new Lecturer("Kay Brown", "25 Side St", false,"Business", "3734564")
        };
        for(Person person : people) {
            person.put();
            System.out.println();
        }
    }
}