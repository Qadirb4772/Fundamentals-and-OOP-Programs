public class StudentMembership extends Membership{
  public StudentMembership(String memberName, String planCode){
    super(memberName, planCode);
  }
  
  @Override 
  public double monthlyFee(){
    return 600.0;
  }
  
}
