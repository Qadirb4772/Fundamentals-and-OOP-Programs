public interface FacilityBadge{
  String displayId();
  String turnstilePayload();
  int countGrantedAccess(String[] zonesRequested);
}
