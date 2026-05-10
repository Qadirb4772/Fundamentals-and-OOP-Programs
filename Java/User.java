abstract class User{
    String name;
    String id;
    
    public User(String name, String id){
        this.name = name;
        this.id = id;
    }
    
    abstract String getRole();
    
    boolean isValidId(){
        if(this.id != null && id.length() >= 5){
            return true;
        }
        return false;
    }
}
