public class Task1Demo{
		public static void main(String[] args){
			BankAccount account = new BankAccount("002825480016", "Qadir Bakhsh");
			SavingsAccount savingsAcc = new SavingsAccount("232113537531", "Abrar Ahmed");
			CurrentAccount currentAcc = new CurrentAccount("115478990900", "Liaqat Ali");
			
			//bankAccount display() and annualInterestRate() 
			System.out.println("General Account Details");
			account.display();
			System.out.println("Annual Interest Rate="+account.annualInterestRate());
			System.out.println();
			
			//SavingsAccount display() and annualInterestRate()
			System.out.println("Savings Account Details");
			savingsAcc.display();
			System.out.println("Annual Interest Rate="+savingsAcc.annualInterestRate());
			System.out.println();
			
			//CurrentAccount display() and annualInterestRate()
			System.out.println("Current Account Details");
			currentAcc.display();
			System.out.println("Annual Interest Rate="+currentAcc.annualInterestRate());
			
		}
}
