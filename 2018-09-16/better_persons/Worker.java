package better_persons;

public class Worker extends Person {
	private String workPlace;
	private int seniority;
	
	public Worker(int age, String name, String id, String workPlace, int seniority) {
		super(age, name, id);
		this.workPlace = workPlace;
		this.seniority = seniority;
	}

	public String getWorkPlace() {
		return workPlace;
	}

	public int getSeniority() {
		return seniority;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println("Work Place: " + getWorkPlace() + ", Seniority: " + getSeniority());
	}
}
