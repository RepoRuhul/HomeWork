package hw9Q3Abstraction;

public interface University {
	public void classSize();

	public abstract void playgoiund();

	public void teacher();

	// public void University() {}
	// an interface doesn't allow the constructor method(above line number 9).
	public default void gymnasium() {
		System.err.println("gymnasium is come from university interface.");
	}

	public static void library() {
		System.out.println("library is come from university interface.");
	}
}
