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
		System.out.println("This result come from ColumbiaUniversity class : ");
	}

	public void ColumbiaUniversity() {
	}

	@Override
	public void lawInfo() {
		System.out.println("This class is from lawSchool: ");
		
	}

	@Override
	public void anatomyLab() {
		System.out.println("This anatomyLab is from ColumbiaUniversity class : ");
		
	}

	@Override
	public void hygiene() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void laboratory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void languageClub() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emergencyRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void surgeryRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void vocationalInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void classSize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playgoiund() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void teacher() {
		// TODO Auto-generated method stub
		
	}
	public static void columbiaUniversity() {
		System.out.println("This static method is from columbiaUniversity: ");
	}

	
}
