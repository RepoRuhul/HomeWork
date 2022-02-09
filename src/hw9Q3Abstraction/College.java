package hw9Q3Abstraction;

public interface College {

	public void commonRoom();

	public abstract void laboratory();

	public void languageClub();

	public default void dorm() {
		System.out.println("dorm is come from collage interface.");
	}

	public static void studyRoom() {
		System.out.println("studyRoom is come from collage interface.");
	}
}
