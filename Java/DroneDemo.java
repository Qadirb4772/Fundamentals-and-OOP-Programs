public class DroneDemo{
    public static void main(String[] args) {
        Drone drone1 = new Drone("DR-##12", 20, 50, true);
        Drone drone2 = new Drone("DR-##13", 34, 45, true);

        //actions on drone1
        drone1.checkMaintenanceStatus();
        drone1.chargeBattery(15);
        drone1.loadCargo(25);
        drone1.loadCargo(3, true);
        System.out.println(drone1.getCurrentWeightCapacity());
        //actions on drone2
        drone2.checkMaintenanceStatus();
        drone2.chargeBattery(15);
        drone2.loadCargo(25);
        drone2.loadCargo(11, true);
        System.out.println(drone2.getCurrentWeightCapacity());
    }
}