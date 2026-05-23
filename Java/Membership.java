public class Membership{
  private String memberName;
  private String planCode;
  
  public Membership(String memberName, String planCode){
    this.memberName  = memberName;
    this.planCode = planCode;
  }
  
  public void display(){
    System.out.println("Member Name = "+this.memberName+"\nPlan Code = "+this.planCode);
  }
  
  public double monthlyFee(){
    //method returning a generic fee later every class overriding this method will return the fee accordingly.....
    return 1500.0;
  }
}
