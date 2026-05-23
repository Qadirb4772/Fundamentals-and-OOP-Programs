public class VisitorBadge implements FacilityBadge{
  private String id;
  private String[] allowedZones;
  private String role;
  
  public VisitorBadge(String id, String[] zones){
    this.id = id;
    this.allowedZones = new String[zones.length];
    for(int i = 0; i < zones.length; i++){
      this.allowedZones[i] = zones[i];
    }
    this.role = "VIS";
  }
  
  public String displayId(){
    return this.id;
  }
  
  public String turnstilePayload(){
    String payload = "QR: " + this.id + role;
    return payload;
  }
  
  public int countGrantedAccess(String[] zonesRequested){
    int grantedZones = 0;
   if(zonesRequested == null || zonesRequested.length == 0){
      return grantedZones;
    }
    for(int i = 0; i < zonesRequested.length; i++){
      String currentZone = zonesRequested[i];
      for(int j = 0; j < allowedZones.length; j++){
        if(currentZone != null && allowedZones[j].equalsIgnoreCase(currentZone)){
            grantedZones++;
            break;
        }
      }
    }
    return grantedZones;
  }
}
