class FacultyMeal extends Meal{
    FacultyMeal(String mealName, double listPrice){
        super(mealName, listPrice);
    }
    
    @Override
    public double price(){
    return super.price()*0.75;
    }
}
