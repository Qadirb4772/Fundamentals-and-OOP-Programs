public class DVD extends LibraryItem implements FineCalculatable{

  private static final int maxDays = 3;
  
  public DVD(String title){
    super(title);  
  }
  
  public double calculateFine(int lateDays){
    return lateDays*10;
  }
  
  public int getMaxDays(){
    return this.maxDays;
  }
   
   
}
