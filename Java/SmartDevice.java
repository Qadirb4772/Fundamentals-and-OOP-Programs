public class SmartDevice {
    private String deviceName;
    private int powerRating;
    private boolean isOn;

    //constructor for devices initially every device is turned off
    public SmartDevice(String deviceName, int powerRating){
        this.deviceName = deviceName;
        if(powerRating > 0){
            this.powerRating = powerRating;
        }else{
            System.out.println("Invalid power rating");
        }
        this.isOn = false;
    }

    //getter for device name
    public String getDeviceName(){
        return this.deviceName;
    }

    //getter for device's power rating
    public int gerPowerRating(){
        return this.powerRating;
    }

    //getter for device's status
    public boolean getStatus(){
        return this.isOn;
    }

    //method for turning on the device is it is turned off
    public void turnOn(){
        if(!this.isOn){
            this.isOn = true;
        }else{
            System.out.println("Device is already turned on!");
        }


    }

    //method for turning off the device if it is turned on
    public void turnOff(){
        if(this.isOn){
            this.isOn = false;
        }else{
            System.out.println("Device is already turned off!");
        }
    }
}
