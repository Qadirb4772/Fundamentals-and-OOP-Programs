class TemperatureMonitor{
	private String roomName;
	private double currentTemperature;
	private double minTemperature;
	private double maxTemperature;
  private double[] temperatureHistory = new double[10];
	//getter for Room Name
	public String getRoomName(){
		return this.roomName;
	}
	//getter for history
	  public double[] getHistoryArray(){
	    return this.temperatureHistory;
	  }
	
	TemperatureMonitor(String roomName, double minTemp, double maxTemp){
		this.roomName = roomName;
		this.minTemperature = minTemp;
		this.maxTemperature = maxTemp;
	}
	int count = 0;
	//method for recording temperature
	public void recordTemperature(double temp){
	  if(temp >= -50 && temp <= 60){
		int index = count % temperatureHistory.length;
		temperatureHistory[index] = temp;
		count++;
		}else{
		System.out.println("Invalid Temperature!!");
		}
	}
	//Overloading the method recordTemperatur(double temp)
	  public void recordTemperature(double[] temps){
	    for(int i = 0; i < temps.length; i++){
	    if(temps[i] >= -50 && temps[i] <= 60){
			int index = count % this.temperatureHistory.length;
			this.temperatureHistory[index] = temps[i];
			count++;
	      }
	    else{
	      System.out.println("Some Invalid Temperatures are recorded");
	      break;
	      }
	    }
	  }

	//method for checking whether temperature is normal or not
	public boolean isTemperatureNormal(){
		if(this.currentTemperature >= this.minTemperature && this.currentTemperature <= this.maxTemperature){
		return true;
	}
		else{
		return false;
		}
	}
	//method for getting temperature status
	public String getTemperatureStatus(){
	    if(this.currentTemperature <= this.minTemperature){
		return "Too Cold";
		}
	   else if(this.currentTemperature > this.maxTemperature){
		return "Too Hot";
		}
	   else{
		return "Normal";
		}
	}//end of the method getTemperatureStatus()

	//method for getting max temperature from history
	public double getMaxRecordedTemperature(){
		double max = this.temperatureHistory[0];
		for(int i = 1; i < this.temperatureHistory.length; i++){
			if(this.temperatureHistory[i] > max){
				max = this.temperatureHistory[i];
			}
		}
		return max;
	}
	//method for getting min temperature from history
	public double getMinRecordedTemperature(){
		double min = this.temperatureHistory[0];
		for(int i = 1; i < this.temperatureHistory.length; i++){
			if(this.temperatureHistory[i] < min){
				min = this.temperatureHistory[i];
			}
		}
		return min;
	
	}
	//method for getting temperature alerts
	public String[] getTemperatureAlerts(){
		int abnormalTemps = 0;
		for(int i = 0; i < this.temperatureHistory.length; i++){
			if(this.temperatureHistory[i] < this.minTemperature || this.temperatureHistory[i] > this.maxTemperature){
				abnormalTemps++;
			}
		}
		String[] tempAlerts = new String[abnormalTemps];
		int index = 0;
	  for(int i = 0; i < this.temperatureHistory.length; i++){
          if(this.temperatureHistory[i] < this.minTemperature || this.temperatureHistory[i] > this.maxTemperature){
          tempAlerts[index++] = Double.toString(this.temperatureHistory[i]);
          }
    }
    return tempAlerts;
	}//end of the method getTemperatureAlerts()

	public void updateTemperature(double newTemp){
		if(newTemp >= -50 && newTemp <= 60){
	  this.currentTemperature = newTemp;
	  this.recordTemperature(currentTemperature);
		}
		else{
			System.out.println("Invalid Temperature");
		}
	}//end of the method updateTemperature(double newTemp)
	
}//end of the class
public class TempMntrngSys{
	public static void main(String[] args){
	//creating a temperature monitor for office room with minTemp = 18 and maxTemp = 25
			TemperatureMonitor tempMonitor1 = new TemperatureMonitor("Office Room", 18, 25);
			//getting temperatureHistory Array
			double History[] = tempMonitor1.getHistoryArray();
			
			//recording several temperatures
			double temperatures[] = {19.5, 20, 27, 29.75, 19.75, 24.5, 17.5, 16.5, 18.5, 17.99};
			tempMonitor1.recordTemperature(temperatures);
			tempMonitor1.updateTemperature(temperatures[3]);
			//getting status based on current Temperature
			String currentStatus = tempMonitor1.getTemperatureStatus();
			
			//getting statistics
			double minimumTemp = tempMonitor1.getMinRecordedTemperature();
			double maximumTemp = tempMonitor1.getMaxRecordedTemperature();
			
			String AbnormalTemps[] = tempMonitor1.getTemperatureAlerts();
			System.out.println("Total Recorded Temperatures of ");
			for(int i = 0; i < History.length; i++){
			    System.out.println(History[i]);
			}
			System.out.println("Current Status="+currentStatus);
			System.out.println("Minimum Temperature = "+minimumTemp);
			System.out.println("Maximum Temperature = "+maximumTemp);
			
			
			for(int i = 0; i < AbnormalTemps.length; i++){
				if(i == 0){
					System.out.println("Total Abnormal Temperatures of Office Room");
				}
			    System.out.println(AbnormalTemps[i]);
			}
			
	}
}
