package hw10Q2UseOfSuperInChildClass;

//Now, Daughter extends Father (super class). Use super method, super keyword and show all of their use in child class. and initialize in a TestFamily Class. Paste GitHub link below.
public class Daughter extends Father  {
	public String birthMonth;
	public int age;

	public Daughter() {
		super();
//		super.father();
//		super.fatherInfo("Ruhul", 40, 'M', false);
//		super.familyName = "Rana";
//		System.out.println("My FamilyName is: " + familyName);

		System.out.println("This default constructor is come from Daughter class.");
	}

	public Daughter(String birthMonth, int age) {

		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("BirthMonth: " + birthMonth + ", Age: " + age);
	}

	public void daughterInfo() {
		System.out.println("This void type method is come from doughter class.");
	}

	public void daughterInfo(String birthMonth, int age) {
		System.out.println("BirthMonth: " + birthMonth + ", Age " + age);
	}
}
