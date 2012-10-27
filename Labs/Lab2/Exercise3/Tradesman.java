class Tradesman extends Employee {
    private String trade;

    Tradesman() {
        //default constructor
    }

    Tradesman(String name, String department, String trade) {
        super(name,department);
        this.trade = trade;
    }

    @Override
    void print() {
        super.print();
        System.out.printf("%-12s%s%n", "Trade: ", trade);
    }
}