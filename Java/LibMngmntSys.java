class Library{
	private String bookTitle;
	private String bookId;
	private Boolean isAvailable = false;
	private String borrowerName;
	private int daysBorrowed;
	//default constructor
	Library(){
		
	}

	//parameterized constructor
	Library(String bookTitle, String bookId){
		this.bookTitle = bookTitle;
		this.bookId = bookId;		
	}
	
	//method for borrowing book
	public void borrowBook(String borrowerName){
	   if(isAvailable){
		this.daysBorrowed = 0;
		this.isAvailable = false;
		this.borrowerName = borrowerName;
	System.out.println("book Borrowed to "+ borrowerName);
		}
	}
	//method for returning book
	public void returnBook(){
		if(!isAvailable){
		this.isAvailable = true;
		this.borrowerName = null;
	System.out.println("Book Returned!!!!!!");
		}
	}
	//method for calculating fine
	public double calculateFine(){
		double fine = 0.0;
		if(daysBorrowed > 14){
			int finingDays= daysBorrowed - 14;
			 fine = finingDays * 0.5;
			return fine;
		}
		else{
			return fine;
		}
	}

	//method for extending borrow period
	public void extendBorrowPeriod(int additionalDays){
		if(additionalDays > 0){
		this.daysBorrowed += additionalDays;
			}
		else{
		  System.out.println("Invalid Days!!");
		}
		}

	//method for getting book info
	public String getBookInfo(){
	  String bookInfo = "Book Title: "+this.bookTitle+"\nBook ID: "+this.bookId+"\nStatus: "+String.valueOf(isAvailable);
		return bookInfo;
	}
	//method for checking whether days are overdue 
	public boolean isOverdue(){
		return daysBorrowed > 14 ? true: false;
	}
}
public class LibMngmntSys{
	public static void main(String[] args){
		//creating a book
		Library lib = new Library("Thinking In Java", "0131872486");
		System.out.println("Book Information\n");
		System.out.println(lib.getBookInfo());
		lib.borrowBook("John");//borrowing it to John
		lib.extendBorrowPeriod(10);//extending days by 10
		boolean isOverdued = lib.isOverdue(); //check whether days are overdued

		if(isOverdued){
			double fine = lib.calculateFine();
		System.out.println("Fine: $"+fine);
		}
		lib.returnBook();
		
	}

}
