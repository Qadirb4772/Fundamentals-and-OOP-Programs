public class BookLoan implements LateFeeRule{
  private static final int GRACE_DAYS = 4;
  private static final double RATE = 1.75;
  private static final double ANNUAL_CAP = 18.5;
  
  public double fineForDaysLate(int lateDays){
    double fine = 0.0;
    int remainingDays = lateDays - GRACE_DAYS;
    
    if(remainingDays <= 0){
        System.out.println("Book Chargeable Days: 0");
        return fine;
    }else{
        System.out.println("Book Chargeable Days: "+remainingDays);
        fine = remainingDays*RATE;
        return fine;
    }
  }
  
  public String[] fineBreakDownLines(int lateDays){
    int totalChargeableDays = lateDays - GRACE_DAYS;
    
    if(totalChargeableDays <= 0){
      
      return new String[0];
    }else{
      
      String[] fineBreakDown = new String[totalChargeableDays];
      for(int i = 0; i < fineBreakDown.length; i++){
        fineBreakDown[i] = "Day "+(GRACE_DAYS+i+1)+ ": "+(1)*RATE;
      }
      return fineBreakDown;
    }
  }
  
  public double applyAnnualCap(double rawFine, double alreadyFinedThisYear){
    double payableFine = ANNUAL_CAP - rawFine;
    if(payableFine <= 0){
      return 0.0;
    }else{
      return Math.min(rawFine, payableFine);
    }
  }
  
}
