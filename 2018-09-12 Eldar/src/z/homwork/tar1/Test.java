package z.homwork.tar1;

public class Test {

	public static void main(String[] args) {
		VideoStore store = new VideoStore();
		store.addVideo("Java 1");
		store.addVideo("Java 2");
		store.addVideo("Java 3");
		
		store.rateVideo(4, 10);
		store.rateVideo(4, 5);
		
		store.listCatalogue();

	}

}
