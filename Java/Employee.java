public abstract class Employee{
  private String name;
  private String id;
  
  public Employee(String name, String id){
    this.name = name;
    this.id = id;
  }
  
  abstract String getRole();
  
  boolean isValidId(){
    return ((this.id != null) && (this.id.length() >= 6) && (this.id.charAt(0) >= '0' && this.id.charAt(0) <= '9'));
    
    
  }
  
}
