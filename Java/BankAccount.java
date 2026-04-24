public class BankAccount{
    private double balance;
    
    BankAccount(double initialBalance){
        if(initialBalance < 0){
            throw new IllegalArgumentException("Invalid Amount");
        }
        else{
            this.balance = initialBalance;
        }
    }
    public double getBalance(){
      return this.balance;
    }
    public void deposit(double amount){
        if(amount < 0){
            throw new IllegalArgumentException("Invalid Amount to deposit");
        }
        else{
            this.balance += amount;
            System.out.println(amount+" deposited in your account!");
        }
    }
    
    public void withdraw(double amount)  throws InsufficientFundsException{
        if(amount < 0){
            throw new IllegalArgumentException("Invalid amount to withdraw");            
        }
        if(amount > this.balance){
            throw new InsufficientFundsException("Insufficient Amount!!");
        }else{
            this.balance -= amount;
            System.out.println(amount+" has been withdrawn from your account!!");
        }
    }
    
    @Override
    public String toString(){
        return "Balance: "+this.balance;
    }
    
     public void transferTo(BankAccount other, double amount) throws InsufficientFundsException{
      if(other == null){
          throw new IllegalArgumentException("Invalid bank account!!");
      }
      else if(amount < 0){
          throw new IllegalArgumentException("Invalid amount");
      }
      
      else{
          if(this.balance < amount){
              throw new InsufficientFundsException("Insufficient Balance");
          }else{
              other.balance += amount;
              this.balance -= amount;
              
              System.out.println(amount +" has been transfered to the account");
          }
      }
  }
  
  public static BankAccount accountWithHigherBalance(BankAccount x, BankAccount y){
      if(x.getBalance() > y.getBalance()){
          return x;
      }else if( y.getBalance() > x.getBalance()){
          return y;
      }else{
          System.out.println("Both are Equal");
          return x;
      }
  }
}
