public class FeeMain{
  public static void main(String[] args){
    DvdLoan fine1 = new DvdLoan();
    BookLoan fine2 = new BookLoan();
    
    //Test Case 1
    System.out.println("Late Days = "+7);
    System.out.println("DVD Fine: "+fine1.fineForDaysLate(7));
    System.out.println("Book Fine: "+fine2.fineForDaysLate(7));
    String[] dvdFineBreakDown = fine1.fineBreakDownLines(7);
    String[] bookFineBreakDown = fine2.fineBreakDownLines(7);
    System.out.println("DVD Break Down Array Length: "+dvdFineBreakDown.length);
    for(String str : dvdFineBreakDown){
      System.out.println(str);
    }
    System.out.println("Book Break Down Array Length: "+bookFineBreakDown.length);
    for(String str: bookFineBreakDown){
      System.out.println(str);
    }
  }
}
