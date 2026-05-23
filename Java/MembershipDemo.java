public class MembershipDemo{
  public static void main(String[] args){
    Membership m = new Membership("Iqra", "GYM-1");
    StudentMembership stdMembership = new StudentMembership("Iqra", "GYM-1");
    ProfessionalMembership profMembership = new ProfessionalMembership("Iqra", "GYM-1");
    
    m.display();
    System.out.println("Membership Fee: \n Fee = " + m.monthlyFee());
    System.out.println("Student Membership Fee: \n Fee = " + stdMembership.monthlyFee());
    System.out.println("Professional Membership Fee:\n Fee = "+profMembership.monthlyFee());
    
    
  }
}
