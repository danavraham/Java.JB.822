package students;

public class Program {

	public static void main(String[] args) {
		Student s1 = new Student(1, "Nir", 70);
//		s1.name = "Nir";
//		s1.setGrade(70);
//		System.out.println("Student name: " + s1.name + ", student grade: " + s1.getGrade());
		
		Student s2 = new Student(2, "Yosi");
//		s2.name = "Yosi";
//		s2.setGrade(100);
//		System.out.println("Student name: " + s2.name + ", student grade: " + s2.getGrade());

		Course c = new Course("Android");
		c.addStudent(s1);
		c.addStudent(s2);
		c.printStudents();
		
		Course c2 = new Course("iOS");
		c2.addStudent(new Student(3, "Blah"));
		c2.addStudent(new Student(4, "Yada"));
		c2.printStudents();
		
	}

}
