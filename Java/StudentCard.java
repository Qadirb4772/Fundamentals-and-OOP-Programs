public class StudentCard{
	private String studentId;
	private String fullName;

	StudentCard(String studentId, String fullName){
		if(studentId != null || !(studentId.trim().isEmpty())){
			this.fullName = fullName;
			this.studentId = studentId;
		}else{
			throw new IllegalArgumentException("Invalid ID or ID not Available please provide it");
		}
	}
	
	//getter for full Name
	public String getFullName(){
	    return this.fullName;
	}
  //overriding toString() method
	@Override 
	public String toString(){
		return "StudentId[ID = "+studentId+" Name = "+fullName+"]";
	}
  
  //overriding equals method
	@Override 
	public boolean equals(Object o){
		if(this == o) return true;
		if(o == null || (getClass() != o.getClass())) return false;
		StudentCard sCard = (StudentCard) o;
		return this.studentId == sCard.studentId;
	 }
	 
	 public boolean studentIdStartsWith(String prefix){
	  if(prefix == null){ return false; }
	  
	  return (this.studentId.startsWith(prefix));
	 }
	 
	 public static StudentCard findByStudentId(StudentCard[] roster, String id){
	    //empty array: method returns null 
	    if(roster == null){
	        return null;
	    }else{
	      boolean studentFound = false;
	      StudentCard studentCard = null;
	      for(int i = 0; i < roster.length; i++){
	          if(roster[i].studentId.equals(id)){
	              studentFound = true;
	              studentCard = roster[i];
	              break;
	          }
	      }
	      return studentCard;
	    }
	 }
}
