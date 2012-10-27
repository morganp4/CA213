class Employee {
    private String name, department;

    Employee() {
        //no-args constructor
    }

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    void print() {
        System.out.printf("%-12s%s%n%-12s%s%n", "Name: ", name, "Department: ", department);
    }

    public boolean equals(Employee e2) {
        return(name == e2.name && department == e2.department);
    }
}