package hw10Q3Abstraction;

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
		System.out.println("this result came from ColumbiaUniversity class");
	}

	public void ColumbiaUniversity() {
	}

	@Override
	public void lawInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub
		
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

	
}
