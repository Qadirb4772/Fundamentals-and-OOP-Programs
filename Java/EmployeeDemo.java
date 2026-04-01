public class EmployeeDemo{
      public static void main(String[] args){
          HourlyEmployee e = new HourlyEmployee("Abrar" , "E102", 80, 50);
          System.out.println("Monthly Pay  =  "+e.monthlyPay());
          System.out.println("Details of the employee are: ");
          e.display();
      }
}
