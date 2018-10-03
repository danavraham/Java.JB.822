package people;

public class Program {

	public static void main(String[] args) {
		
		int num1 = 9;
		
		Person person1 = new Person();
		person1.id = 123456789;
		person1.name = "Donald Duck";
		person1.age = 102;
		System.out.println( person1.showInfo() );
		person1.checkAge();
		
//		Person person2 = new Person();
//		System.out.println( person2.id );

	}

}
