public class BankAccountDemo{
  public static void main(String[] args){
      BankAccount account1 = new BankAccount(1200);
      BankAccount account2 = new BankAccount(5855);
      try {
          account1.withdraw(1300);
      }catch(InsufficientFundsException ex){
          System.out.println(ex.getMessage());
      }
      
      try {
          account1.withdraw(1100);
      }catch(InsufficientFundsException ex){
          System.out.println(ex.getMessage());
      }
      System.out.println("Current Balance: "+account1);
      try {
      account2.transferTo(account1, 1000);
      }catch(InsufficientFundsException ex){
          System.out.println(ex.getMessage());
      }
      System.out.println(BankAccount.accountWithHigherBalance(account1, account2));
  }
}
