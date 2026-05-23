public class ExpenseMain{
  public static void main(String[] args){
    /*
    Expense myExpense = new Expense("Youtube Premium Installment", 12000");
    this above line is commented out because it will cause error because Expense is an abstract class and cannot be instantiated
    */
    
    SubscriptionExpense myExpense = new SubscriptionExpense("Youtube Premium", 12000, 600);
    myExpense.printStatus();
  }
}
