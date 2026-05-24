public class PremiumUser extends VerifiedUser{
  private int extraStorageGb;
  
  public PremiumUser(String username, String email, int extraStorageGb){
    super(username, email);
    if(extraStorageGb > 0){
      this.extraStorageGb = extraStorageGb;
    }else{
      System.out.println("Storage Cannot be Negative!!");
    }
  }
  
  @Override 
  public void display(){
    super.display();
    System.out.println("Extra Storage = "+this.extraStorageGb+" GB");
  }
  
  @Override 
  public int monthlyUploadQuotaMb(){
    return super.monthlyUploadQuotaMb() +(this.extraStorageGb * 500);
  }
} 
