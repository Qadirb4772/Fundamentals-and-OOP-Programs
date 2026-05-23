
public class BadgeMain{
  public static void main(String[] args){
    String staffZones[] = {"A", "LAB", "SERVER", "OFFICE"};
    String visitorZones[] = {"LOBBY"};
    
    String requestedZones[] = {};
    
    FacilityBadge staffBadge = new StaffBadge("EMP120093", staffZones);
    FacilityBadge visBadge = new VisitorBadge("VIS232312", visitorZones);
    
    System.out.println("Visitor IDs:\n");
    System.out.println("Staff ID: " + staffBadge.displayId());
    System.out.println("Visitor ID: " + visBadge.displayId());
    
    System.out.println("Turnstile Pay Load for Staff: "+staffBadge.turnstilePayload());
    System.out.println("Turnstile Pay Load for Visitor: "+visBadge.turnstilePayload());
    
    System.out.println("Total Granted Zones for Staff: "+staffBadge.countGrantedAccess(requestedZones));
    System.out.println("Total Granted Zones for Visitor: "+visBadge.countGrantedAccess(requestedZones));
  }
}
