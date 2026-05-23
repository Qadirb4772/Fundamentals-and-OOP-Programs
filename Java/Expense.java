public abstract class Expense{
  private String label;
  private double monthlyBudget;
  
  public Expense(String label, double monthlyBudget){
    this.label = label;
    if(monthlyBudget > 0){
      this.monthlyBudget = monthlyBudget;
    }else{
      System.out.println("Invalid Monthly Budget!! Cannot be negative!!");
    }
  }
  
  public abstract double spentSoFar();
  
  public void printStatus(){
    System.out.println("Label = "+this.label+"\nRemaining = "+(this.monthlyBudget - this.spentSoFar()));
  }
}
