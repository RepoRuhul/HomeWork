package hw11Q3Abstraction.copy;

//Extends(one) key words are used to inheritance the Abstract class.
//Abstract class can inherit other abstract class by the extends keyword.
//Abstract class can inherit regular class by extends key word.
// Abstract class can't inherit interface by extends keyword.
//Abstract class can inherit interface by implements key word.
//Abstract class can't inherit the abstract class more than one.
//abstract class can't inherit the regular class by implement keyword.

public abstract class MedicalSchool extends NursingSchool implements LawSchool {
	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("the biochemistryLab is from medical school. ");
	}

	public MedicalSchool() {
	}
	public static void medicalSchool() { 
		
	}
    
}
