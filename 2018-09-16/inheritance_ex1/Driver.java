package inheritance_ex1;

public class Driver extends Person {
	private String bloodType, licenseType;
	private int licenseNum;
	
	public Driver(int age, String name, String id, String bloodType, String licenseType, int licenseNum) {
		super(age, name, id);
		this.bloodType = bloodType;
		this.licenseType = licenseType;
		this.licenseNum = licenseNum;
	}

	public String getBloodType() {
		return bloodType;
	}

	public String getLicenseType() {
		return licenseType;
	}

	public int getLicenseNum() {
		return licenseNum;
	}
	
	public void printDriver(){
		printBasic();
		System.out.println("Blood Type: " + getBloodType() + ", License Number: " + getLicenseNum() + ", License Type: " + getLicenseType());
	}
}
