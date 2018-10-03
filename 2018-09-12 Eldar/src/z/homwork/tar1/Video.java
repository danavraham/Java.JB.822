package z.homwork.tar1;

public class Video {
	
	// attributes
	private String title;
	private boolean checkedOut;
	private int ratingSum;
	private int ratingCount;
	private double averageRating;
	
	// CTOR1
	public Video(String title) {
		super();
		this.title = title;
	}

	// methods
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public void addRating(int rate) {
		this.ratingSum += rate;
		this.ratingCount++;
		this.averageRating = (double)ratingSum/ratingCount;
	}

	public double getAverageRating() {
		return averageRating;
	}
	
	public void checkout(){
		this.checkedOut = true;
	}
	
	public void returnToStore(){
		this.checkedOut = false;
	}

	public boolean isCheckedOut() {
		return checkedOut;
	}

}
