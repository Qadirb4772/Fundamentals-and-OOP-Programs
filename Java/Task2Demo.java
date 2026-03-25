public class Task2Demo{
		public static void main(String[] args){
			Meal meal = new Meal("Vegetable", 150);
			StudentMeal stdMeal = new StudentMeal("Vegetable", 150);
			FacultyMeal facMeal = new FacultyMeal("Vegetable", 150);
			
			//printing display and price for  meal
			meal.display();
			System.out.println("Price = "+meal.price());
			System.out.println();
			
			//printing display and price for student meal
			System.out.println("Student Meal Details");
			stdMeal.display();
			System.out.println("Price = "+stdMeal.price());
			System.out.println();
			//printing display and price for faculty meal
			System.out.println("Faculty meal details");
			facMeal.display();
			System.out.println("Price="+facMeal.price());
		}		
}
