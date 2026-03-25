class SalariedEmployee extends Employee{
  private double monthlySalary;
  
  public SalariedEmployee(String name, String employeeId, double monthlySalary){
    super(name, employeeId);
    if(monthlySalary > 0){
        this.monthlySalary = monthlySalary;
        }else{
          System.out.println("Salary Cannot be Negative!!");
          this.monthlySalary = 0;
        }
  }
  
  @Override
  public void display(){
    super.display();
    System.out.println("Monthly Salary = "+this.monthlySalary);
    }
  @Override
  public double monthlyPay(){
    return this.monthlySalary;
  }
}
