package hw10Q3Abstraction;

// Extends key words are used to inheritance the interface class.
// Interface can inherit other interface.
//Interface cann't inherit regular class or abstract class.
// Interface can inherited in interface class one or more than one.
public interface University extends College, Hospital {
	public void classSize();

	public abstract void playgoiund();

	public void teacher();

	// Interface doesn't allow the constructor method
	// public void University() {}

	public default void gymnasium() {
		System.err.println("gymnasium is come from university interface.");
	}

	public static void library() {
		System.out.println("library is come from university interface.");
	}
}
