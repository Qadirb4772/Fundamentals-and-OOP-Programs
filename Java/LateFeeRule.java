interface LateFeeRule{
  double fineForDaysLate(int lateDays);
  String[]  fineBreakDownLines(int lateDays);
  double applyAnnualCap(double rawFine, double alreadyFinedThisYear);
} 
