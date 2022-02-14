package hw9Q3Abstraction;

//Extends(one) key words are used to inheritance the Abstract class.
//Abstract class can inherit other abstract class and regular class.
//Abstract class cann't inherit interface class.
//Abstract class can't inherit the abstract class more than one.
public abstract class MedicalSchool extends NursingSchool {
	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("the biochemistryLab is from medical school. ");
	}

	public MedicalSchool() {
	}
}
