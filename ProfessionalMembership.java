public class ProfessionalMembership extends Membership{
  public ProfessionalMembership(String memberName, String planCode){
    super(memberName, planCode);
  }
  
  @Override
  public double monthlyFee(){
    return 2500.0;
  }
}
