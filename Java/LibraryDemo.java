public class LibraryDemo{
  public static void main(String[] args){
    BorrowableBook b = new BorrowableBook("OOP Guide", "B-19", 14);
    b.summaryLine();
    System.out.println(b.availabilityNote());
    System.out.println(b.dueDayNumber(5));
  }
}
