public abstract class Notification{
  private String id;
  private String body;
  
  public Notification(String id, String body){
    this.id = id;
    this.body = body;
  }
  
  public String getId(){
    return this.id;
  }
  
  public String getBody(){
    return this.body;
  }
  
  public abstract String render();
  
  public void preview(){
    System.out.println(this.render());
  }
}
