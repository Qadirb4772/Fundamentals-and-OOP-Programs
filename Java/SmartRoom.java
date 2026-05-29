import java.util.ArrayList;

public class SmartRoom {
    private String roomName;
    private ArrayList<SmartDevice> smartDevices;

    //constructor for Smart Room
    public SmartRoom(String roomName){
        this.roomName = roomName;
        this.smartDevices = new ArrayList<>();
    }

    public void addDevice(SmartDevice device){
        if(device != null){
            smartDevices.add(device);
        }else{
            System.out.println("Invalid Device!!");
        }
    }

    public int calculateCurrentPowerUsage(){
        int totalPower = 0;
        for (SmartDevice smartDevice : smartDevices) {
            if(smartDevice.getStatus()){
                totalPower += smartDevice.gerPowerRating();
            }
        }
        return totalPower;
    }

    public void masterShutDown(){
        for(SmartDevice device: smartDevices){
            device.turnOff();
        }
    }


}
