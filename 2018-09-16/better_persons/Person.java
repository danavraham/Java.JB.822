package better_persons;

public class Person {
	private int age;
	private String name, id;
	
	public Person(int age, String name, String id) {
		super();
		this.age = age;
		this.name = name;
		this.id = id;
	}
	
	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}



	public void print(){
		System.out.println("Name: " + getName() + ", age: " + getAge() + ", id: " + getId());
	}
	
}
