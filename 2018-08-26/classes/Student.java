package classes;

public class Student {
	String id, name, email, phone, gender;
	byte age;
	
	public void printInfo(){
		System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email 
				+ ", Phone: " + phone + ", Gender: " + gender + ", Age: " + age);
	}
}
