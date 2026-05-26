public class Car extends Vehicle{
  public Car(String type, String numberPlate, String ownerName, boolean isElectric){
    super(type, numberPlate, ownerName, isElectric);
  }
  
  public void start(){
    System.out.println("Car starts by start button");
  }
  
  public void stop(){
    System.out.println("Car stops by foot break or hand break");
  }
  
  public double calculateFuelConsumption(){
    return 5;
  }
  
}
