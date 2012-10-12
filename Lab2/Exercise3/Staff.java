import java.util.*;

class Staff {
  private ArrayList<Employee> staff = new ArrayList<Employee>();
  
  Staff() {
    //no-args constructor
  }
  
  boolean hire(Employee e1) {
    return staff.add(e1);
  }
  
  boolean fire(Employee e1) {
    return staff.remove(e1);
  }
  
  void put() {
    for(Employee staffMember: staff) {
      staffMember.print();
      System.out.println();
    }
  }
}