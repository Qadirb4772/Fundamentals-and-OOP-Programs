class LabAssistant extends User implements AccessControl{
  LabAssistant(String name, String id){
    super(name, id);
  }
  
  @Override
  public String getRole(){
    return "Lab Assistant";
  }
  
  @Override
  public boolean canAccessLab(){
    return true;
  }
  
  @Override
  public void performDuty(){
    System.out.println("Manages Lab");
  }
}
