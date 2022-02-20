package hw11Q3Abstraction.copy;

public interface College {

	public void commonRoom();

	public abstract void laboratory();

	public void languageClub();

	public default void dorm() {
		System.out.println("This dorm  method is come from collage interface.");
	}

	public static void studyRoom() {
		System.out.println("This studyRoom is come from collage interface.");
	}
}
