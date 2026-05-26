public class Bike extends Vehicle{
  
  public Bike(String type, String numberPlate, String ownerName, boolean isElectric){
    super(type, numberPlate, ownerName, isElectric);
  }
  public void start(){
    System.out.println("Bike Starts by kick-start"); 
  }
  
  public void stop(){
    System.out.println("Bike stops by taking out gears and pressing break slowly!!");
  }
  
  public double calculateFuelConsumption(){
    return 2;
  }
  
  
}
