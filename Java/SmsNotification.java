public class SmsNotification extends Notification{
  private int maxLen;
  public SmsNotification(String id, String body, int maxLen){
    super(id, body);
    if(maxLen > 0){
      this.maxLen = maxLen;
    }else{
      System.out.println("Length of the message cannot be negative!!");
    }
  }
  
  @Override
  public String render(){
    if(super.getBody().length() < maxLen){
      return super.getBody();
    }else{
      return super.getBody().substring(0, maxLen);
    }
  }
}
