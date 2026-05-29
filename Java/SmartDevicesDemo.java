public class SmartDevicesDemo {
    public static void main(String[] args) {
        //1. creating one room and two smart devices (e.g. AC and Bulb)
        SmartRoom myRoom = new SmartRoom("Living Room");
        SmartDevice myDevice1 = new SmartDevice("AC", 1500);
        SmartDevice myDevice2 = new SmartDevice("Bulb", 15);

        //2. adding both to room
        myRoom.addDevice(myDevice1);
        myRoom.addDevice(myDevice2);

        //3. turning on bulb
        myDevice2.turnOn();

        //4. calculating total power usage
        System.out.println("Total usage while only bulb is on: "+myRoom.calculateCurrentPowerUsage());

        //5. turning on AC
        myDevice1.turnOn();

        //6. calculating total power usage
        System.out.println("Total power usage while both AC and bulb are on: "+ myRoom.calculateCurrentPowerUsage());

        //7. executing master shutdown
        myRoom.masterShutDown();

        //8. calculating total power usage after turning everything off
        System.out.println("Total power usage after turning everything off: "+myRoom.calculateCurrentPowerUsage());

    }
}
