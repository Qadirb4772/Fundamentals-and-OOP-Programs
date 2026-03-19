class AnimalDog{
    public static void main(String[] args){
        Dog dog = new Dog("Max", "Labrador");
        System.out.print("Sound=");
        dog.makeSound();
        dog.displayInfo();
    }
}
