package people;

public class Person {

	int id;
	String name;
	byte age;
	
	public String showInfo(){
		return "Name: " + name + ", Age: " + age + ", ID: " + id;
	}
	
	public void checkAge(){
		if(age > 40){
			System.out.println(name + " is old...");
		} else {
			System.out.println(name + " is not so old...");
		}
	}

}
