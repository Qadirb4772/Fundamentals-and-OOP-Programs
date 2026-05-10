public class ReferenceBook extends LibraryItem{
  public ReferenceBook(String title){
    super(title);
  }
  
  public void borrowItem() throws LibraryException{
    throw new LibraryException("Errrr!!! Can't borrow reference book");
  }
  
  public int getMaxDays(){
    return 0;
  }
  public void returnBook() throws LibraryException{
    throw new LibraryException("Cannot return reference book");
  }
  
  
}
