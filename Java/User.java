public class User{
  private String username;
  
  public User(String username){
    this.username = username;
  }
  
  public String getUsername(){
    return this.username;
  }
  
  public void display(){
    System.out.println("Username = "+this.username);
  }
  
  public int monthlyUploadQuotaMb(){
    return 500;
  }
}
