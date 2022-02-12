package hw10Q3Abstraction;

public interface Hospital {
	public void emergencyRoom();

	public void surgeryRoom();

	public void cafeteria();

	public default void pharmacy() {
		System.out.println("pharmacy is come from interface Hospital. ");
	}

	public static void morgue() {
		System.out.println("morgue is from interface Hospital.");
	}
}
