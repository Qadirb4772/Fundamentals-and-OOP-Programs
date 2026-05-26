public abstract class Vehicle{
  private String type;
  private String numberPlate;
  private String ownerName;
  private boolean isElectric;
  public Vehicle(String type, String numberPlate, String ownerName, boolean isElectric){
    if((type != null && numberPlate != null && ownerName != null) || (type.trim().length() == 0 && numberPlate.trim().length() == 0 && ownerName.trim().length() == 0)){
      this.type = type;
      this.numberPlate = numberPlate;
      this.ownerName = ownerName;
      this.isElectric = isElectric;
    }else{
      System.out.println("Invalid Vehicle!!");
    }
  }
  abstract void start();
  abstract void stop();
  abstract double calculateFuelConsumption();
  
  public void display(){
    System.out.println("Type = "+this.type);
    System.out.println("Number Plate Number = "+this.numberPlate);
    System.out.println("Owner = "+this.ownerName);
    System.out.println("Is Electric? ="+this.isElectric);
    System.out.println("Fuel Consumption = "+this.calculateFuelConsumption()+" liter per km");
  }
}
