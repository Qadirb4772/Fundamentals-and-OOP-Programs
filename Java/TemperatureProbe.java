public class TemperatureProbe implements SafetyCheck{
  private int min;
  private int max;
  
  public TemperatureProbe(int min, int max){
    this.min = Math.min(min,max);
    this.max = Math.max(min,max);
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
    if(batch ==  null || batch.length == 0){
      System.out.println("The Batch is empty!!");
      return count;
    }else{
      for(double temp: batch){
        if(!isSafe(temp)){
          count++;
        }
      }
      return count;
    }
  }
  
  public String worstCaseSummary(double[] batch){
  boolean isAllOk = true;
    for(int i = 0; i < batch.length; i++){
      double temp = batch[i];
      if(!isSafe(temp)){
        isAllOk = false;
        if(temp < this.min){
          return "Worst Temperature\n "+temp+"\nToo Cold Temperature";
        }else if(temp > this.max){
          return "Worst Temperature\n"+temp+"\nToo Hot Temperature";
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
