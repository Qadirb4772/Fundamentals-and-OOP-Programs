public class HumidityProbe implements SafetyCheck{
  private int min;
  private int max;
  
  public HumidityProbe(int min, int max){
    this.min = Math.min(min, max);
    this.max = Math.max(min, max);
  }
  
  public boolean isSafe(double reading){
    if(reading >= this.min && reading <= this.max){
      return true;
    }else{
      return false;
    }
  }
  
  public int unsafeCount(double[] batch){
    int count = 0;
    if(batch == null || batch.length == 0){
      return count;
    }else{
      for(int i = 0; i < batch.length; i++){
        if(!isSafe(batch[i])){
          count++;
        }
      }
    }
    return count;
  }
  
  public String worstCaseSummary(double[] batch){
    boolean isAllOk = true;
    for(int i = 0; i < batch.length; i++){
      if(!isSafe(batch[i])){
        isAllOk = false;
        if(batch[i] < min){
          return "Worst Temperature\n "+batch[i]+"\nToo Dry";
        }else if(batch[i] > max){
          return "Worst Temperature\n "+batch[i]+"\nToo Humid";
        }
      }
    }
    if(isAllOk){
      return "OK";
    }else{
      return "";
    }
  }
}
