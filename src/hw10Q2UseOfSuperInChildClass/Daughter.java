package hw10Q2UseOfSuperInChildClass;

public class Daughter extends Father {
	public String birthMonth;
	public int age;

	public Daughter() {
		super();
		super.familyName = "Rana";
		System.out.println("My FamilyName is: " + familyName);

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
