package hw11Q3Abstraction.copy;

//In regular class Extends(one) key words are used to inheritance the regular class.
//In regular class extends key words are used to inheritance the abstract class.
//Regular class can inherit  only one other regular class by extends keywords.
//Regular class can inherit the interface class by implement keywords.
//Regular class can inherit only one abstract class by extends keywords.
//Regular class can inherit  one or more than one interface class by implement keyword.

public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool {

	// public abstract void chemistry();
	// Inside the regular class abstract method(line 12) doesn't allowed.
	public void biology() {
		System.out.println("This defualt metod is come from ColumbiaUniversity class: ");
	}

	public ColumbiaUniversity() {
	}

	@Override
	public void lawInfo() {
		System.out.println("This lawInfo method is come from InterFace lawSchool class.");

	}

	@Override
	public void anatomyLab() {
		System.out.println("This anatomyLab method is come from Abstract MedicalSchool class.");

	}

	@Override
	public void hygiene() {
		System.out.println("This hygiene method is came from Abstract NursingSchool class.");

	}

	@Override
	public void commonRoom() {
		System.out.println("This commonRoom method is come from InterFace Collage class.");

	}

	@Override
	public void laboratory() {
		System.out.println("This laboratory method is come from InterFace Collage class.");

	}

	@Override
	public void languageClub() {
		System.out.println("This languageClub method is come from InterFace Collage class.");

	}

	@Override
	public void emergencyRoom() {
		System.out.println("This emergencyRoom method is come from Interface Hospital class.");

	}

	@Override
	public void surgeryRoom() {
		System.out.println("This surgeryRoom method is come from Interface Hospotal class.");

	}

	@Override
	public void cafeteria() {
		System.out.println("This cafeteria method is come from Interface Hospital class.");

	}

	@Override
	public void vocationalInfo() {
		System.out.println("This vocationalInfo method is come from VocationalSchool Interface class.");

	}

	@Override
	public void classSize() {
		System.out.println("This classSize method is come from University Interface class.");

	}

	@Override
	public void playgoiund() {
		System.out.println("This playgoiund method is come from University Interface class.");

	}

	@Override
	public void teacher() {
		System.out.println("This teacher method is come from University Interface class.");
	}

	public static void columbiaUniversity() {
		System.out.println("This columbiaUniversity method is come from columbiaUniversity Regular class.");
	}
}
