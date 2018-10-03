package inheritance_ex1;

public class Program {

	public static void main(String[] args) {
		Person p1 = new Person(30, "Some Guy", "123456789");
		p1.printBasic();
		
		Worker w1 = new Worker(25, "Bob the builder", "1111111", "Loli", 10);
		w1.printWorker();
		
		Driver d1 = new Driver(40, "Shumi", "6666666", "O+", "Sport plus", 11111); 
		d1.printDriver();
		

	}

}
