package hw10Q2UseOfSuperInChildClass;

public class TestFamily {
	public static void main(String[] args) {

		System.out.println("---------- default constructor initialized for Daughter Class ----------");
		Daughter daughter01 = new Daughter();

		System.out.println("\n---------- parameterized constructor initialized for Daughter Class ----------");
		Daughter daughter02 = new Daughter("Nobember", 3);

		System.out.println("\n---------- void type method initialized for Daughter Class ----------");
		daughter02.daughterInfo();

		System.out.println("\n---------- parameterized method initialized for Daughter Class ----------");
		daughter02.daughterInfo("January", 7);

		System.out.println("\n---------- default constructor initialized for Father Class ----------");
		Father father01 = new Father();

		System.out.println("\n---------- parameterized constructor initialized for Father Class ----------");
		Father father02 = new Father("Ruhul", 38, 'M', true);

		System.out.println("\n---------- void type method initialized for Father Class ----------");
		father02.father();

		System.out.println("\n---------- parameterized method initialized for Father Class ----------");
		father02.fatherInfo("Rana", 40, 'M', false);
	}
}
