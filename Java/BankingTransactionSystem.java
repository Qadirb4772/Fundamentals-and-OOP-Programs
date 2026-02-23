class BankAccount{
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private String accountType;
    private String[] transactionHistory = new String[20];
    private int transactionCount;

    //PARAMETERIZED CONSTRUCTOR
    BankAccount(String accountNumber, String accountHolderName, double initialBalance, String accountType){
        if(accountType.equalsIgnoreCase("Savings") && initialBalance < 500){
            System.out.println("Savings account should have minimum balance of Rs. 500");
        }
        else if(accountType.equalsIgnoreCase("Checking") && initialBalance < 100){
        initialBalance -= 5;    
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        this.accountType = accountType;}
        else{
            this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        this.accountType = accountType;
        }
    }
    int count = 0;
    //method for depositing amount
    public void deposit(double amount){
        if(amount < 0){
            System.out.println("Invalid amount");
        }
        else{
            this.balance += amount;
            int index = count % this.transactionHistory.length;
            transactionHistory[index] = "You deposited Rs."+amount+" in your account!!";
            count++; this.transactionCount++;
            System.out.println(amount+" deposited in your account!");
        }
    }

    //method for withdrawing amount
    public void withdraw(double amount){
        if(amount > this.balance){
            System.out.println("Insufficient Balance in your account!\nYour current Balance is "+this.balance);
            return;
        }
        if(amount < 0){
            System.out.println("Invalid Amount!!");
            return;
        }
        else{
            this.balance -= amount;
            int index = count % this.transactionHistory.length;
            transactionHistory[index] = "An Amount of Rs. "+amount+" withdrew from your account!";
            count++; this.transactionCount++;
            System.out.println("Rs. "+amount+" withdrew from your account!\nYour current balance is "+this.balance);
        }
    }
    //getter for accountNumber
    public String getAccountNumber(){
        return this.accountNumber;
    }
    //method for transferring money from one account to another
    public void transfer(BankAccount recipient, double amount){
        if(amount < 0){
            System.out.println("Invalid Amount!!");
        }
        if(this.balance < amount){
            System.out.println("There is Insufficient balance in your Account!\nYour Current Balance is "+this.balance);
        }
        else{
            this.balance -= amount;
            recipient.balance += amount;
            int index = count % this.transactionHistory.length;
            this.transactionHistory[index] = "An amount of Rs. "+amount+" transferred to "+recipient.accountHolderName;
            recipient.transactionHistory[index] = "You received an amount of Rs. "+amount+" from "+this.accountHolderName;
            count++; this.transactionCount++;
            System.out.println("An Amount of Rs. "+amount+" transferred from your account to "+recipient.accountHolderName);
        }
    }
    //method for calculating Interest
    public double calculateInterest(){
        double interest;
        if(this.accountType.equalsIgnoreCase("Savings")){
            interest = (this.balance * 2)/100;
            return interest;
        }
        else{
            interest = (this.balance *0.5)/100;
            return interest;
        }
    }
    
    //method for applying interest
    public void applyInterest(){
        this.balance += this.calculateInterest();
    }
    
    //method for getting balance
    public double getBalance(){
        return this.balance;
    }

    //method for getting transaction history
    public String[] getTransactionHistory(){
        return this.transactionHistory;
    }

    //method for getting account Summary
    public String getAccountSummary(){
        String Summary = "Account Holder Name = "+this.accountHolderName+"\nAccount Number = "+this.accountNumber+"\nAccount Type = "+this.accountType+"\nAccount Balance = "+this.balance+"\nTotal Transactions = "
        +this.transactionCount;
        return Summary;
    }

    //method for checking whether balance is low?
    public boolean isLowBalance(){
        if(this.balance < 100){
            return true;
        }
        else{
            return false;
        }
    }

    //method for checking whether amount can be withdrawn or not
    public boolean canWithdraw(double amount){
        if(amount < 0){
            System.out.println("Amount is Invalid please enter a valid amount");
            return false;
        }
        else if(amount > this.balance){
            return false;
        }
        else{
            return true;
        }
    }
}//end of the class BankAccount
public class BankingTransactionSystem {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("120300101428250019", "Qadir Bakhsh", 600, "Savings");
        BankAccount account2 = new BankAccount("120300101428250022", "Abrar Ahmed", 200, "Checking");

        account1.deposit(1200);//depositing in Account1
        account1.withdraw(1000);//withdrawing from Account1

        account2.deposit(1340); //depositing in Account2
        account2.withdraw(1200); //withdrawing from Account2

        account1.transfer(account2, 1000);
        account2.transfer(account1, 100);

        double interest1 = account1.calculateInterest();
        double interest2 = account2.calculateInterest();

        System.out.println("Interest on Account1 = "+interest1);
        System.out.println("Interest on Account2 = "+interest2);
        account1.applyInterest();
        account2.applyInterest();
        System.out.println("Is balance of account1 is Low: "+account1.isLowBalance());
        System.out.println("Is balance of account2 is Low: "+account2.isLowBalance());

        String[] account1History = account1.getTransactionHistory();
        String[] account2History = account2.getTransactionHistory();
        System.out.println();
        System.out.println(account1.getAccountNumber()+" History");
        for (int i = 0; i < account1History.length; i++){
            System.out.println(account1History[i]);
        }
        System.out.println(account2.getAccountNumber()+" History");
        for (int i = 0; i < account2History.length; i++) {
            System.out.println(account2History[i]);
        }
        
        String summary1 = account1.getAccountSummary();
        String summary2 = account2.getAccountSummary();

        System.out.println(account1.getAccountNumber()+" Summary: ");
        System.out.println(summary1);

        System.out.println(account2.getAccountNumber()+" Summary: ");
        System.out.println(summary2);

    }
    
}
