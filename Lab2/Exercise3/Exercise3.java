class Exercise3 {
  public static void main(String[] args) {
    
    //Declare Staff
    Staff personnel = new Staff();
    
    //Declare Employees
    Employee e1 = new Employee("Mike","Sales");
    Employee e2 = new Tradesman("Fred","Engineering","Welder");
    Employee e3 = new Employee("Pat","Sales");
    Employee e4 = new Tradesman("Jean","Finishing","Painter");
    Employee e5 = new Employee("Bill","Marketing");
    Employee e6 = new Tradesman("Anne","Engineering","Fitter");
    Employee e7 = new Tradesman("Paul","Design","Draughtsman");
    Employee e8 = new Tradesman("Eddy","Finishing","Painter");
    Employee e9 = new Employee("John","Despatch");
    
    //Hire Staff
    personnel.hire(e1); personnel.hire(e2); personnel.hire(e3);
    personnel.hire(e4); personnel.hire(e5); personnel.hire(e6);
    personnel.hire(e7); personnel.hire(e8); personnel.hire(e9);
    
    //Print out personnel
    personnel.put(); 
    System.out.println("========================");
    
    //Fire some employees
    personnel.fire(e1); personnel.fire(e5); personnel.fire(e9);
    
    //Print out personnel
    personnel.put();
    System.out.println("========================");
    
    //Fire a trades man
    personnel.fire(new Tradesman("Eddy","Finishing","Painter"));
    
    //Print out personnel
    personnel.put();
  }
}