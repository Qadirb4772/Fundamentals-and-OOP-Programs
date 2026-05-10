public class BookSpec{
    private final String ISBN;
    private final double finePerDay;
    
    BookSpec(String isbn, double finePerDay){
        this.ISBN = isbn;
        this.finePerDay = finePerDay;
    }
    
    public String getIsbn(){
      return this.ISBN;
    }
    
    public double getFinePerDay(){
      return this.finePerDay;
    }
    
}
