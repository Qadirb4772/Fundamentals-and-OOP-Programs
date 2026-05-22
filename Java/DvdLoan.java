public class DvdLoan implements LateFeeRule{
  private static final double RATE = 1;
  private static final double ANNUAL_CAP = 10;
  
  public double fineForDaysLate(int lateDays){
    double fine = 0.0;
    
    if(lateDays <= 0){
      System.out.println("DVD Chargeable Days: 0");
      return fine;
    }else{
      System.out.println("DVD Chargeable Days: "+lateDays);
      return lateDays * RATE;
    }
  }
  
  public String[] fineBreakDownLines(int lateDays){
      if(lateDays <= 0){
        return new String[0];   
      }else{
        String[] fineBreakDown = new String[lateDays];
        for(int i = 0; i < fineBreakDown.length; i++){
          fineBreakDown[i] = "Fine for Day "+(i+1)+": "+(1)*RATE;
        }
        return fineBreakDown;
      }
  }
  
  public double applyAnnualCap(double rawFine, double alreadyFinedThisYear){
    double room = ANNUAL_CAP - alreadyFinedThisYear;
    if(room <= 0){
      return 0.0;
    }else{
      return Math.min(room, rawFine);
    }
  }
}
