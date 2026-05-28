public class Drone {
    private String droneId;
    private double batteryLevel;
    private double currentWeightCapacity;
    private boolean isFlyable;

    public Drone(String droneId, double batteryLevel, double currentWeightCapacity, boolean isFlyable){
        this.droneId = droneId;
        if(batteryLevel > 0 && batteryLevel <= 100){
            this.batteryLevel = batteryLevel;
        }else{
            System.out.println("Battery Level is Invalid");
        }
        if(currentWeightCapacity < 0){
            System.out.println("Weight Capacity cannot be negative");
        }else{
            this.currentWeightCapacity = currentWeightCapacity;
        }
        this.isFlyable = isFlyable;
    }

    //getter for drone Id
    public String getDroneId(){
        return this.droneId;
    }

    //getter for battery level
    public double getBatteryLevel(){
        return this.batteryLevel;
    }

    //getter for current weight capacity
    public double getCurrentWeightCapacity(){
        return this.currentWeightCapacity;
    }

    //getter for Flyable status
    public boolean getFlyableStatus(){
        return this.isFlyable;
    }

    //method for charging the drone
    public void chargeBattery(double amount){
        if(amount >= 0 && amount <= 100){
            this.batteryLevel += amount;
            if(this.batteryLevel > 100){
                this.batteryLevel = 100;
                System.out.println("Drone is fully charged!!");
                this.isFlyable = true;
            }else if(this.batteryLevel >= 15 && this.batteryLevel < 100){
                this.isFlyable = true;
            }
        }else{
            System.out.println("Invalid Battery charge amount!!!");
        }
    }

    //method for Maintenance Check 
    public void checkMaintenanceStatus(){
        if(this.batteryLevel < 15){
            this.isFlyable = false;
            System.out.println("Please charge the drone");
        }
    }

    public void loadCargo(double weight){
        if (isFlyable && weight <= this.currentWeightCapacity) {
            this.currentWeightCapacity -= weight;
            this.batteryLevel -= weight*2;
            if(this.batteryLevel < 0) this.batteryLevel = 0;

            System.out.println("Cargo loaded Successfully!!");
            checkMaintenanceStatus();
        }else{
            System.out.println("Drone has no enough capacity! Please reduce the weight or charge the drone");
        }
    }

    public void loadCargo(double weight, boolean fragile){
        if(fragile && this.batteryLevel < 50){
            System.out.println("Rejected: Fragile cargo needs 50% battery or above it! Your current battery level is: "+this.getBatteryLevel());
        }else{
            loadCargo(weight);
        }
    }


}
