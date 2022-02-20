package hw11Q3Abstraction.copy;

//Total only(extends) one keywords are used for the inheritance in interface.
// Extends(one) key word are used to inheritance the interface class.
// Interface can inherit other interface by extends key word.
//Interface cann't inherit regular class or abstract class.
// Interface can inherited interface class one or more than one.
//Interface can't inherit to regular class or abstract class by implement keywords.
public interface University extends College, Hospital {
	public void classSize();

	public abstract void playground();

	public void teacher();

	// Interface doesn't allow the constructor method
	// public void University() {}

	public default void gymnasium() {
		System.out.println("This gymnasium default method is come from university interface class.\n");
	}

	public static void library() {
		System.out.println("This static library method is come from university interface class.");
	}
}
