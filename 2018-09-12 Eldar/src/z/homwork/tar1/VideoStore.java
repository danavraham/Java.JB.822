package z.homwork.tar1;

public class VideoStore {

	private Video[] catalogue = new Video[10];
	private int videoCount;

	public void addVideo(String videoTitle) {
		if (videoCount < catalogue.length) {
			Video video = new Video(videoTitle);
			catalogue[videoCount] = video;
			videoCount++;
		}
	}

	public void checkOutVideo(int index) {
		if (index >= 0 && index < catalogue.length && catalogue[index] != null) {
			catalogue[index].checkout();
		}
	}

	public void returnVideo(int index) {
		if (index >= 0 && index < catalogue.length && catalogue[index] != null) {
			catalogue[index].returnToStore();
		}
	}

	public void rateVideo(int index, int rate) {
		if (index >= 0 && index < catalogue.length && catalogue[index] != null) {
			catalogue[index].addRating(rate);
		}
	}

	public Video getVideoByTitle(String videoTitle) {
		for (int i = 0; i < catalogue.length; i++) {
			if (catalogue[i] != null && catalogue[i].getTitle().equals(videoTitle)) {
				return catalogue[i];
			}
		}
		return null;
	}

	public void listCatalogue() {
		System.out.println("=== List of videos ===");
		for (int i = 0; i < catalogue.length; i++) {
			if (catalogue[i] != null) {
				Video v = catalogue[i];
				System.out.println("Video[title=" + v.getTitle() + ", rating=" + v.getAverageRating() + ", checkedOut="
						+ v.isCheckedOut() + "]");
			}
		}
		System.out.println("=== ============== ===");
	}
}
