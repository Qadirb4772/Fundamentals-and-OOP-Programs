abstract class LibraryItem{
  String title;
  boolean isBorrowed;
  LibraryItem(String title){
    this.title = title;
    this.isBorrowed = false;
  }
  abstract int getMaxDays();
  
  void borrowItem() throws LibraryException{
    if(!isBorrowed){
      this.isBorrowed = false;
      System.out.println("Book Borrowed");
    }else{
      throw new LibraryException("Invalid Action Book is already is Borrowed");
    }
  }
  
  void returnItem() throws LibraryException{
    if(isBorrowed){
      this.isBorrowed = false;
      System.out.println("Book Returned");
    }else{
      throw new LibraryException("Invalid Action Book is already returned");
    }
  }
}
