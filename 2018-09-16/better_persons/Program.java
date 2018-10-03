package better_persons;

public class Program {

	public static void main(String[] args) {
		
//		Person p1 = new Person(11, "fgfd", "234324");
//		p1.print();
		
//		Worker w1 = new Worker(12, "dfgfd", "4565", "Google", 10);
//		w1.print();
		
		
		Person[] people = new Person[3];
		people[0] = new Person(10, "aaa", "111");
		people[1] = new Worker(20, "BBB", "2222", "JBH", 10);
		people[2] = new Driver(33, "dfgdfg", "455464", "A+", "AAAA", 123);
		
		//people[1].print();
		
		for (int i = 0; i < people.length; i++) {
			people[i].print();
			System.out.println("-------------");
		}
		
//		if(people[2] instanceof Worker){
//			System.out.println( ((Worker)people[2]).getWorkPlace() );
//		}
		

	}

}
