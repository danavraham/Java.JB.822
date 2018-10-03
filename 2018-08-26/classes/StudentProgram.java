package classes;

public class StudentProgram {

	public static void main(String[] args) {

		Student nir;
		nir = new Student();
		nir.age = 41;
		nir.email = "nirg@jbh.co.il";
		nir.gender = "Male";
		nir.id = "1223425";
		nir.name = "Nir Gal";
		nir.phone = "092423543";
		nir.printInfo();
		
		
		Student dor = new Student();
		dor.name = "Dor David";
		dor.age = 20;
		dor.email = "dor@gmail.com";
		dor.id = "123456789";
		dor.phone = "2312342354";
		dor.gender = "Male";
		dor.printInfo();
		
		

	}

}
