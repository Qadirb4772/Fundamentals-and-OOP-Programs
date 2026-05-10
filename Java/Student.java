public class Student extends User implements AccessControl{
    private boolean hasLabAccess;
    Student(String name, String id){
      super(name, id);
    }
    
    @Override 
    String getRole(){
      return "Student";
    }
    
    @Override
    public boolean canAccessLab(){
      if(hasLabAccess){
          return true;
      }else{
        return false;
      }
    }
    
    public void performDuty(){
      System.out.println("Student is doing lab work");
    }
    
    public void requestAccess() throws InvalidAccessException{
        if(super.isValidId()){
           hasLabAccess = true;
        }else{
          throw new InvalidAccessException("Invalid Access Request");
        }
    }
}
