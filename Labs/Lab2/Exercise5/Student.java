import java.util.*;

class Student extends Person {
    private String studentNumber, study;
    private int years;

    Student(String name, String address, boolean sex, String studentNumber, String study, int years) {
        super(name, address, sex);
        this.studentNumber = studentNumber;
        this.study = study;
        this.years = years;
    }

    @Override
    int completionYear() {
        return Calendar.getInstance().get(Calendar.YEAR) + years;
    }

    @Override
    void put() {
        super.put();
        System.out.println("Student Number:" + studentNumber);
        System.out.println("Study:" + study);
    }
}