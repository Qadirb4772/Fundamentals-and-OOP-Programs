class CurrentAccount extends BankAccount{

  //parameterized Constructor
    CurrentAccount(String accNo, String accHldrName){
        super(accNo, accHldrName);
    }
    
    @Override
    public void display(){
      super.display();
      System.out.println("Account Type: Current Type");
    }
    
    @Override
    public double annualInterestRate(){
      //here the returned double value e.g 3 should be treated as 3%
      return 0.1;
    }
    

}

