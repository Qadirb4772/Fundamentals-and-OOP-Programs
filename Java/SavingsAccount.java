class SavingsAccount extends BankAccount{
    SavingsAccount(String accNo, String accHldrName){
        super(accNo, accHldrName);
    }
    
    @Override
    public void display(){
        super.display();
        System.out.println("Account Type: Savings");
    }
    
    @Override
    public double annualInterestRate(){
    //here the returned double value e.g 4.0 should be treated as 4.0%
      return 4.0;
    }
}
