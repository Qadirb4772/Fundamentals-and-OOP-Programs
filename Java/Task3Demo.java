public class Task3Demo{
    public static void main(String[] args){
        HotelRoom hotelRoom = new HotelRoom("1200");
        StandardRoom standardRoom = new StandardRoom("132");
        Suite suite = new Suite("892");
        
        //calling display() and nightlyRate() on generic hotelRoom
        System.out.println("General Hotel Room Details");
        hotelRoom.display();
        System.out.println("General Hotel Room Nightly Rate is: "+hotelRoom.nightlyRate());
        System.out.println();
        //calling display() and nightlyRate() on standardRoom
        System.out.println("Standard Room Details");
        standardRoom.display();
        System.out.println("Standard Room nightly Rate is: "+standardRoom.nightlyRate());
        System.out.println();
        //calling display() and nightlyRate() on Suite
        System.out.println("Standard Room Details");
        suite.display();
        System.out.println("Suite Nightly Rate is: "+suite.nightlyRate());
    }
}
