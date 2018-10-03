package inheritance_ex2;

public class PlasticBox extends Box {
	private double height, width, length;

	public PlasticBox() {
		super("no label");
	}

	public PlasticBox(String label) {
		super(label);
	}

	public PlasticBox(String label, double height, double width, double length) {
		super(label);
		this.height = height;
		this.width = width;
		this.length = length;
		calcVolume();
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println("Length: " + length + ", Height: " + height + ", Width: " + width);
	}
	
	public void calcVolume(){
		volume = length * width * height;
	}
	
}
