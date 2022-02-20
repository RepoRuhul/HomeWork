package hw11Q3Abstraction.copy;

public interface College {

	public void commonRoom();

	public abstract void laboratory();

	public void languageClub();

	public default void dorm() {
		System.out.println("This default  method is come from collage interface class.");
	}

	public static void studyRoom() {
		System.out.println("This studyRoom static method is come from collage interface class .");
	}
}
