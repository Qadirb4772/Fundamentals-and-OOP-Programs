class BankAccount{
    private String accountNumber;
    private String accountHolderName;
    
    //parameterized constructor
    BankAccount(String accNo, String accHldrName){
        this.accountNumber = accNo;
        this.accountHolderName = accHldrName;
    }
    
    //method for Mini Account Statement
    public void display(){
        System.out.println("Account Holder = "+this.accountHolderName);
        System.out.println("Account Number = "+this.accountNumber);
    }
    
    //method for annual Interest Rate
    public double annualInterestRate(){
        //here the function returns a double (e.g 1.5) 
        //it should be interpreted as 1.5% as its the annualInterestRate
        return 1.5;
    }
}
