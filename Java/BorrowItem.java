public class BorrowItem{
  private BookSpec spec;
  private int days;
  BorrowItem(BookSpec spec, int days){
      this.spec = spec;
      this.days = days;
  }
  
  public int getDays(){
    return this.days;
  }
  
  public double calculateFine(){
    if(this.days <= 0){
      return 0.0;
    }else{
      return this.days * this.spec.getFinePerDay();
    }
  }
}
