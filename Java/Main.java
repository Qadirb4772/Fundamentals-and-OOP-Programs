public class ExamMain{
  public static void main(String[] args){
  //1. Creating 1 Student and 1 Lab Assistant 
    Student s1 = new Student("Abrar Ahmed", "ST-010");
    LabAssistant assistant = new LabAssistant("Abdul Rauf", "ST-120");
    
    //2. Printing each's role
    System.out.println(s1.getRole());
    System.out.println(assistant.getRole());
    
    //3. requesting access
   try {
      s1.requestAccess();
   }catch(InvalidAccessException e){
       System.out.println(e.getMessage());
      }
    
    //4. can student access lab
    System.out.println(s1.canAccessLab());
    
    //5. can Lab Assistant access lab
    System.out.println(assistant.canAccessLab());
    
    //6. calling performDuty();
    s1.performDuty();
    assistant.performDuty();
  }
}
