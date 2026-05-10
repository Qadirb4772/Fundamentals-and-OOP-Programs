public class ExamMain{
  public static void main(String[] args){
    //Tasks
    //1.
    System.out.println(LibraryCatalog.byIsbn("XX"));
    //2. 
    BorrowItem item1 = new BorrowItem(new BookSpec("BK101", 3.0),  3);
   System.out.println(item1.calculateFine());
    //3.
    BorrowItem item2 = new BorrowItem(new BookSpec("BK202", 5.0), 2);
    System.out.println(item2.calculateFine());
    
    //4.
    LibraryCart cart = new LibraryCart(item1, item2);
    System.out.println(cart.totalFine());
    
    //5. 
    System.out.println(cart.qualifiesForWaiver());
    
    //6. 
   LibraryCart cart2 = new LibraryCart(new BorrowItem(new BookSpec("BK101", 2), 2), new BorrowItem (new BookSpec("BK202", 2), 2));
   System.out.println(cart2.qualifiesForWaiver());
    
    
  }
}
