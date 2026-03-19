class Dog extends Animal{
    private String breed;
    
    //parameterized constructor
    Dog(String name, String breed){
      super(name);
      this.breed = breed;
    }
    
    @Override
    public void makeSound(){
        System.out.println("Bark");
    }
    
    public void displayInfo(){
      System.out.println("Name = "+super.getName());
      System.out.println("Breed = "+this.breed);
    }
}
