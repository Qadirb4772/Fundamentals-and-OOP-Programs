class Suite extends HotelRoom{
  
  public Suite(String roomCode){
    super(roomCode);
  }
  
  @Override
    public double nightlyRate(){
      return 12500;
    }
    
    @Override 
    public void display(){
      super.display();
      System.out.println("Room Type: Suite");
    }
}
