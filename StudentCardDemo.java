public class StudentCardDemo{
	public static void main(String[] args){
		StudentCard card1 = new StudentCard("S132", "Abrar Ahmed");
		StudentCard card2 = new StudentCard("S132", "Qadir Bakhsh");
    StudentCard[] cards = {new StudentCard("S101", "Abrar Ahmed"), new StudentCard("S121", "Zulqarnain"), new StudentCard("S224", "Asaad Ahmed")};
    
    StudentCard studentCard = StudentCard.findByStudentId(cards, "S101");
    System.out.println("Student With ID S101 is: "+studentCard.getFullName());
    System.out.println("Is there is an ID which starts with S0: "+cards[1].studentIdStartsWith("S0")); 
    
		System.out.println("is Card1 equals Card2: "+card1.equals(card2));
		System.out.println("Details of card2 are:\n"+card2);
	}
}
