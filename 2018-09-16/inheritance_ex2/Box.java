package inheritance_ex2;

import java.text.DecimalFormat;

public class Box {
	private String label;
	protected double volume;
	
	public Box(String label) {
		super();
		this.label = label;
	}
	
	public String getLabel() {
		return label;
	}
	
	public double getVolume() {
		return volume;
	}

	public void print(){
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("Box data: " + getLabel() + ", " + df.format(getVolume()));
	}
	
}
