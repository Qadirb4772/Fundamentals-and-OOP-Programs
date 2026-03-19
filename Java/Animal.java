class Animal{
    private String name;
    
    //parameterized constructor
    Animal(String name){
      this.name = name;
    }
    
    //getter for name
    public String getName(){
      return this.name;
    }
    
    public void makeSound(){
      System.out.println("Makes a Sound");
    }
}
