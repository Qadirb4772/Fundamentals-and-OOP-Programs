public class Book extends LibraryItem implements FineCalculatable{
  private static final int maxDays = 7;
  public Book(String title){
    super(title);
  }
  public int getMaxDays(){
    return this.maxDays;
  }
  
  public double calculateFine(int lateDays){
    return lateDays*5;
  }
} 
