package students;

import java.util.Random;

public class Student {
	String name;
	private float grade;
	private long id;
	
	// constructors
	public Student(long id, String name, float grade) {
		super();
		this.id = id;
		this.name = name;
		setGrade(grade);
	}
	
	public Student(long id, String name) {
		super();
		this.id = id;
		this.name = name;
		Random rand = new Random();
		this.grade = rand.nextFloat()*101;
	}
	
	
	// getters/setters
	public float getGrade() {
		return grade;
	}
	
	public void setGrade(float grade) {
		if(grade >= 0 && grade <= 100){
			this.grade = grade;
		} else {
			System.out.println("Invalid grade");
		}
	}
	
	public long getId() {
		return id;
	}
	
	
	
}
