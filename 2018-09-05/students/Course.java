package students;

public class Course {
	String name;
	private Student[] students = new Student[10];
	
	public Course(String name) {
		this.name = name;
	}
	

	public void addStudent(Student s){
		for (int i = 0; i < students.length; i++) {
			if(students[i] == null){
				students[i] = s;
				break;
			}
		}
	}
	
	public void printStudents(){
		System.out.println(this.name);
		for (int i = 0; i < students.length; i++) {
			if(students[i] != null){
				System.out.println( students[i].getId() + "- " + students[i].name + ": " + students[i].getGrade());
			}
		}
		System.out.println();
	}

}
