class Employee{
    private String name;
    private String employeeId;
    
    public Employee(String name, String employeeId){
      this.name = name;
      this.employeeId = employeeId;
    }
    
    public void display(){
      System.out.println("Name = "+this.name);
      System.out.println("Employee ID = "+this.employeeId);
    }
    
    public double monthlyPay(){
      return 0.0;
    }
    
}
