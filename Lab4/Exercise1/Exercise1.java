class Exercise1 {
    public static void main(String[] args) {
        Date d1 = new Date();
        Date d2 = new Date();
        d1.get();
        d2.get();
        if(d1.lte(d2)) System.out.println(d1);
        else System.out.println(d2);
    }
}