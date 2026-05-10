public class Developer extends Employee implements Workable{
    private double salary;
  Developer(String name, String id, double salary){
    super(name, id);
    this.salary = salary;
  }
  
  @Override 
  public void doWork(){
    System.out.println("The developer develops the softwares");
  }
  
  @Override 
  public double getSalary() throws  InvalidSalaryException{
    if(this.salary < 0){
        throw new InvalidSalaryException("Invalid Salary");
    }else{
        return this.salary;
    }
  }
  
  @Override 
  public String getRole(){
    return "Employee";
  }
}
