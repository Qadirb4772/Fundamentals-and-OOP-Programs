class Manager extends SalariedEmployee{
  private double bonusPercent;
  
  public Manager(String name, String employeeId, double monthlySalary, double bonusPercent){
    super(name, employeeId, monthlySalary);
    if(bonusPercent > 0 && bonusPercent < 100){
      this.bonusPercent = bonusPercent;
    }else{
      System.out.println("Invalid Bonus Percent");
      this.bonusPercent = 0.0;
    }
  }
  
  @Override
  public void display(){
    super.display();
    System.out.println("Bonus = "+this.monthlyPay());
  }
  
  @Override
  public double monthlyPay(){
    return (super.monthlyPay()*(1+this.bonusPercent/100));
  }
}
