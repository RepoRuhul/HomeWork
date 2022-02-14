package hw9Q3Abstraction;

//Extends(one) key words are used to inheritance the regular class.
//Regular class can inherit other regular class and abstract class.
//Regular class cann't inherit interface class.
//Regular class can inherit one regular class and one abstract class.
public class ColumbiaUniversity extends MedicalSchool {

	// public abstract void chemistry();
	// Inside the regular class abstract method(line 5) doesn't allowed.
	public void biology() {
		System.out.println("this result came from ColumbiaUniversity class");
	}

	public void ColumbiaUniversity() {
	}

	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hygiene() {
		// TODO Auto-generated method stub

	}
}
