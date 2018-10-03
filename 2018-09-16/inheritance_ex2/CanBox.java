package inheritance_ex2;

public class CanBox extends Box {
	private double diameter, height;

	public CanBox() {
		super("No label");
	}
	
	public CanBox(String label) {
		super(label);
	}

	public CanBox(String label, double diameter, double height) {
		super(label);
		this.diameter = diameter;
		this.height = height;
		calcVolume();
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println("Height: " + height + ", Diameter: " + diameter);
	}
	
	public void calcVolume(){
		volume = height * Math.PI * Math.pow(diameter/2, 2);
	}
}
