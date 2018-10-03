package hw;

public class Note {
	String title, body, date, status;
	
	public Note(String title, String body, String date, String status) {
		super();
		this.title = title;
		this.body = body;
		this.date = date;
		this.status = status;
	}

	public void changeStatus(String newStatus){
		this.status = newStatus;
	}
	
	public void changeDate(String newDate){
		this.date = newDate;
	}
	
	

}
