public class Main{
  public static void main(String[] args){
    //1. creating employees
   Developer em1 = new Developer("Qadir Bakhsh", "Dev1002", 80000);
    Manager em2 = new Manager("Abrar Ahmed", "Mng1010", 120000);
    
    //2. printing roles
    System.out.println(em1.getRole());
    System.out.println(em2.getRole());
    
    //3. calling doWork()
    em2.doWork();
    em1.doWork();
    
  //4,5. printing salary and handling  InvalidSalaryException  
    try{
      System.out.println("Salary of em1: "+em1.getSalary());
      System.out.println("Salary of em2: "+em2.getSalary());
    }catch( InvalidSalaryException e){
      System.out.println(e.getMessage());
    }
    
    
  }
}
