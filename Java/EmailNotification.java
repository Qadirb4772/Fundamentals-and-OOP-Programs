public class EmailNotification extends Notification{
  private String subject;
  
  public EmailNotification(String id, String subject, String body){
    super(id, body);
    this.subject = subject;
  }
  
  @Override 
  public String render(){
    String renderredMsg = "Subject: "+this.subject +"\n"+"Message: "+this.getBody();
    
    return renderredMsg;
  }
  
}
