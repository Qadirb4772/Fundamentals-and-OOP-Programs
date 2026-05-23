public class SubscriptionExpense extends Expense{
  private double monthlyCharge;
  
  public SubscriptionExpense(String label, double monthlyBudget, double monthlyCharge){
    super(label, monthlyBudget);
    if(monthlyCharge > 0){
      this.monthlyCharge = monthlyCharge;
    }else{
      System.out.println("Invalid monthly Charge! Cannot be negative!!");
    }
  }
  
  @Override
  public double spentSoFar(){
    return this.monthlyCharge;
  }
  
  
}
