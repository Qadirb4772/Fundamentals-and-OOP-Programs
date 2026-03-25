public class EmployeeMain{
    public static void main(String[] args){
      Employee employee = new Employee("Qadir Bakhsh", "10011");
      SalariedEmployee salariedEmployee = new SalariedEmployee("Masood Ahmed", "12110", 12000);
      Manager manager = new Manager("Abrar Ahmed", "98221", 110000, 12);
      
      System.out.println("Salary Of Employee is: "+employee.monthlyPay());
      System.out.println("Salary of Salaried Employee is: "+salariedEmployee.monthlyPay());
      System.out.println("Salary of Manager is: "+manager.monthlyPay());
    }
}
