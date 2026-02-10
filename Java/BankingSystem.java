/*Bank Account System
Create a BankAccount class:

Private attributes: accountNumber (int), balance (double), accountType (String)
Default constructor and parameterized constructor
Getter and setter methods
Method deposit(double amount) that adds to balance (use logical operators to validate amount > 0)
Method withdraw(double amount) that subtracts from balance (validate amount > 0 and <= balance)
Method convertToUSD(double rate) that converts balance using type casting
Method getAccountInfoArray() that returns String array with account information
Method isAccountValid() that returns true if accountNumber > 0 and balance >= 0 (use logical operators)
Method getAccountStatus() that uses ternary operator: "Active" if balance > 0, else "Inactive"
Create a Main class to test all methods*/
//Solution:- 
class BankAccount{
  private int accountNo;
  private double balance;
  private String accountType;
  
  //Default Constructor
  BankAccount(){
    this.accountNo = 0;
    this.balance = 0.0;
    this.accountType = null;
  }
  //Parameterized Constructor
  BankAccount(int accountNo, double balance, String accountType){
    this.accountNo = accountNo;
    this.balance = balance;
    this.accountType = accountType;
  }
//Setter for account Number
  public void setAccountNo(int accountNo){
    this.accountNo = accountNo;
  }
// getter for account Number
  public int getAccountNo(){
  return this.accountNo;
  }
//setter for balance 
  public void setBalance(double bal){
    if(bal < 0.0){
      System.out.println("Invalid Balance");
    }
    else{
      this.balance = bal;
    }
  }
// getter for balance
  public double getBalance(){
    return this.balance;
  }
//setter for accountType
  public void setAccountType(String accountType){
    this.accountType = accountType;
  }
  //getter for accountType
  public String getAccountType(){
    return this.accountType;
  }
  
  //method for Deposit Money
  public void deposit(double amount){
  double currentBal = this.getBalance();
    if(amount < 0){
      System.out.println("Invalid Amount!!!!!!");
    }
    else{
      currentBal += amount;
      System.out.println(amount+" deposited into your account!!!!");
    }
    this.setBalance(currentBal);
  }
  //method for withdrawal of Money
  public void withdraw(double amount){
  double currentBalance = this.getBalance();
    if(amount < 0){
      System.out.println("Invalid Amount!!!!");
    }
    else if(amount > currentBalance){
      System.out.println("Insufficient Amount in your Account, current balance is: "+currentBalance);
    }
    else{
      currentBalance -= amount;
      System.out.println(amount+" withdrew from your account!!!!");
    }
    setBalance(currentBalance);
  }
  //Method for converting PKR To USD
  public void convertToUSD(double rate){
    if(rate < 0){
      System.out.println("Invalid Rate!!!");
    }
    else{
      int USD = (int)(rate/279.45);
      System.out.println("Rs. " +rate + " = " +"$"+ USD);
    }
  }
  //method for Account Info Array
  public String[] getAccountInfoArray(){
    String[] Info = {Integer.toString(this.accountNo), Double.toString(this.getBalance()), accountType};
     return Info;
  }
  //method for checking account Validity
  public boolean isAccountValid(){
    if(this.accountNo > 0 && this.getBalance() >= 0){
        return true;
    }
    return false;
  }
  //method for getting account status
  public String getAccountStatus(){
  return (this.getBalance() > 0 ? "Active" : "Inactive");
  }
  
}//end of the class BankAccount
public class BankingSystem{
  public static void main(String[] args){
  BankAccount account1 = new BankAccount(2332442, 21548.5, "Saving");
  account1.deposit(2);
  account1.withdraw(22);
  System.out.println("Balance is: " + account1.getBalance());
  account1.convertToUSD(2100);
  System.out.println(account1.getBalance());
  String AccountInfo[] = account1.getAccountInfoArray();
  for(String str: AccountInfo){
    System.out.println(str);
  }
  
  System.out.println("Is Account Valid: "+account1.isAccountValid());
  System.out.println("Account Status: " + account1.getAccountStatus());
  }
}
