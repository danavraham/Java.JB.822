package hw;

public class Group {
	String title;
	int numOfNotes;
	Note[] notes = new Note[10];
	
	
	// constructor
	public Group(String title) {
		super();
		this.title = title;
	}



	public void addNote(Note newNote){
//		for (int i = 0; i < notes.length; i++) {
//			if(notes[i] == null){
//				notes[i] = newNote;
//				break;
//			}
//		}
		
		if(numOfNotes < notes.length){
			notes[numOfNotes] = newNote;
			numOfNotes++;
		} else {
			System.out.println("No more room for new notes!");
		}
	}

}
