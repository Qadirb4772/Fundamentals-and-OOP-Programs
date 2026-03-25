class StandardRoom extends HotelRoom{
  
  public StandardRoom(String roomCode){
    super(roomCode);
  }
  
  @Override
  public double nightlyRate(){
    return 6500;
  }
  
  @Override
  public void display(){
    super.display();
    System.out.println("Room Type: Standard Room");
  }
  }
