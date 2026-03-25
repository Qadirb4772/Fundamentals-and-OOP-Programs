class HotelRoom{
  private String roomCode;
  
  public HotelRoom(String roomCode){
    this.roomCode = roomCode;
  }
  
  public void display(){
    System.out.println("Room: "+this.roomCode);
  }
  
  public double nightlyRate(){
    //this is the cheapest tier
    return 3000;
  }
}
