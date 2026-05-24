public class VerifiedUser extends User{
  private String email;
  
  public VerifiedUser(String username, String email){
    super(username);
    if(email.contains("@")){
      this.email = email;
    }else{
      System.out.println("Invalid Email");
    }
  }
  
  @Override 
  public void display(){
    super.display();
    System.out.println("Email = "+this.email);
  }
  
  @Override
  public int monthlyUploadQuotaMb(){
    return 2000;
  }
}
