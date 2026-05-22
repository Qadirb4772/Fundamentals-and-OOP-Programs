public interface SafetyCheck{
  boolean isSafe(double reading);
  int unsafeCount(double[] batch);
  String worstCaseSummary(double[] batch);
}
