public class Manager extends Employee implements Workable{
    private double baseSalary;
    Manager(String name, String id, double salary){
        super(name, id);
        this.baseSalary = salary;
  }
    
    @Override
    public void doWork(){
      System.out.println("Managing employees");
    }
    
      @Override 
    public double getSalary() throws InvalidSalaryException{
      if(this.baseSalary < 0){
          throw new InvalidSalaryException("Invalid Salary");
      }else{
          double totalSalary = this.baseSalary +(this.baseSalary*10/100);
          return totalSalary;
      }
    }
    
      @Override 
  public String getRole(){
    return "Manager";
  }
}
