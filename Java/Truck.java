public class Truck extends Vehicle{
  public Truck(String type, String numberPlate, String ownerName, boolean isElectric){
    super(type, numberPlate, ownerName, isElectric);
  }
  
  public void start(){
    System.out.println("Truck starts by key");
  }
  
  public void stop(){
    System.out.println("Truck stops by foot break or hand break");
  }
  
  public double calculateFuelConsumption(){
    return 8;
  }
}
