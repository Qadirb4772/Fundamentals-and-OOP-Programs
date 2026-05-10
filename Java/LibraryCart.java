public class LibraryCart{
  private BorrowItem A;
  private BorrowItem B;
  
  LibraryCart(BorrowItem A, BorrowItem B){
    this.A = A; this.B = B;
  }
  
  public double totalFine(){
    return this.A.calculateFine() + this.B.calculateFine();
  }
  
  public boolean qualifiesForWaiver(){
    return (A.getDays() <= 2 && B.getDays() <= 2);
  }
}
