public class UsersMain{
  public static void main(String[] args){
    User user = new User("qadir1234");
    VerifiedUser verifiedUser = new VerifiedUser("qadir1234", "qadir@example.com");
    PremiumUser premiumUser = new PremiumUser("qadir1234", "qadirbakhsh@example.com", 2);
    
    //showing Normal User details
    user.display();
    System.out.println("Monthly Upload = "+user.monthlyUploadQuotaMb()/1000.0 +"GB");
  
  //showing VerifiedUser details
  verifiedUser.display();
  System.out.println("Monthly Upload = "+verifiedUser.monthlyUploadQuotaMb()/1000.0+"GB");
  
  //showing PremiumUser details 
  premiumUser.display();
  System.out.println("Monthly Upload = "+premiumUser.monthlyUploadQuotaMb()/1000.0+"GB");
  
  }
}
