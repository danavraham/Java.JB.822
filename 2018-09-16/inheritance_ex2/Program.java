package inheritance_ex2;

public class Program {

	public static void main(String[] args) {
//		Box b1 = new Box("Stam box");
//		b1.print();
		
		PlasticBox p1 = new PlasticBox();
		p1.print();
		System.out.println("***************************");
		
		PlasticBox p2 = new PlasticBox("Tupperware");
		p2.print();
		System.out.println("***************************");
		
		PlasticBox p3 = new PlasticBox("Lunch box", 100, 5, 20);
		//p3.calcVolume();
		p3.print();
		System.out.println("***************************");
		
		CanBox c1 = new CanBox();
		c1.print();
		System.out.println("***************************");
		
		CanBox c2 = new CanBox("Tuna");
		c2.print();
		System.out.println("***************************");
		
		CanBox c3 = new CanBox("Luf", 10, 300);
		c3.print();
		System.out.println("***************************");

	}

}
