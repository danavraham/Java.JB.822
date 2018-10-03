package hw;

public class Program {

	public static void main(String[] args) {
//		Note myFirstNote = new Note("Don't forget", "Throw out the trash", "5-9-18", "Pending");
//		System.out.println("Our note is now: " + myFirstNote.status);
//		myFirstNote.changeStatus("In Progress");
//		System.out.println("Our note is now: " + myFirstNote.status);
//		
//		
//		Group todo = new Group("To Do");
//		todo.addNote(myFirstNote);
//		todo.addNote(myFirstNote);
//		todo.addNote(myFirstNote);
//		todo.addNote(myFirstNote);
//		todo.addNote(myFirstNote);
//		todo.addNote(myFirstNote);
//		todo.addNote(myFirstNote);
//		todo.addNote(myFirstNote);
//		todo.addNote(myFirstNote);
//		todo.addNote(myFirstNote);
//		todo.addNote(myFirstNote);
//		
//		System.out.println( todo.notes[0].title );
		
		Group group1 = new Group("some nice group");
		System.out.println(group1.title);
		group1.addNote( new Note("dfgsd", "Yaakov was here", "dfgfdgdf", "closed") );
		System.out.println(group1.notes[0].body);
		
	}

}
