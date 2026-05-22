import java.util.Scanner;
public class SensorBatch{
  public static void main(String[] args){
    TemperatureProbe tempSensor = new TemperatureProbe(18, 25);
    HumidityProbe humidSensor = new HumidityProbe(20, 40);
    
    Scanner sc = new Scanner(System.in);
    System.out.println("*********************************\n\tTemperature And Humidity Sensor\n*********************************");
    System.out.println("Choose One from below: \n 1. One Value\n 2. Too many Values\n 3. None");
    int choice  = sc.nextInt();
    do{
      
        if(choice == 1){
          System.out.print("Enter The value = ");
          double value = sc.nextDouble();
          System.out.println("is the value within range for temperature: "+tempSensor.isSafe(value));
          System.out.println("is the value within range for humidity: "+humidSensor.isSafe(value));
          break;
        }
      else if(choice == 2){
            System.out.print("How many Values: ");
            int values = sc.nextInt();
            double[] arr = new double[values];
            for(int i = 0; i < arr.length; i++){
              System.out.print("Enter the value "+(i+1)+" = ");
              arr[i] = sc.nextDouble();
            }
            
            System.out.println("Total Worst Temperatures in your values: "+tempSensor.unsafeCount(arr));
            System.out.println(tempSensor.worstCaseSummary(arr));
            System.out.println("Total Worst Humidities in your values: "+humidSensor.unsafeCount(arr));
            System.out.println(humidSensor.worstCaseSummary(arr));
          break;
      }
    }while(choice != 3);
    
    
  }
}
