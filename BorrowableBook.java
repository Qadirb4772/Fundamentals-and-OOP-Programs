public class BorrowableBook extends LibraryItem{
  private int loanDays;
  
  public BorrowableBook(String title, String catalogId, int loanDays){
    super(title, catalogId);
    this.loanDays = loanDays;
  }
  
  public int getLoanDays(){
    return this.loanDays;
  }
  
  @Override
  public String availabilityNote(){
    return "Borrow up to "+this.loanDays+" days";
  }
  
  public int dueDayNumber(int startDay){
    if(startDay <= 31){
      return this.loanDays+startDay;
    }else{
      System.out.println("Invalid Start Day!!!");
      return -1;
    }
  }
}
