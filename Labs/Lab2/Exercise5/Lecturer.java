import java.util.*;

class Lecturer extends Person {
    private String staffNumber, department;

    Lecturer(String name, String address, boolean sex, String department, String staffNumber) {
        super(name, address, sex);
        this.staffNumber = staffNumber;
        this.department = department;
    }

    @Override
    int completionYear() {
        return Calendar.getInstance().get(Calendar.YEAR) - Integer.parseInt(staffNumber.substring(0,2));
    }

    @Override
    void put() {
        super.put();
        System.out.println("Staff Number:" + staffNumber);
        System.out.println("Department:" + department);
    }
}
