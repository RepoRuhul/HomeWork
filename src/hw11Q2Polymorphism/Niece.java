package hw11Q2Polymorphism;

public class Niece extends Sister {

	@Override
	public void sister() {
		System.out.println("This is a void type method which come from Niece class.");
	}

	public void sister(int age1, int age2) {
		int total7 = age1 + age2 - 21;
		System.out.println("Total area of total7 is: " + total7);
	}

	@Override
	public int sister(int age1, int age2, int age3) {
		int total8 = age1 + age2 + age3 + 10;
		System.out.println("Total area of total8 is: " + total8);
		return total8;
	}

	@Override
	public int sister(int age1, int age2, int age3, String age4) {
		int total9 = age1 + age2 + age3 + Integer.parseInt(age4) - 100;
		System.out.println("Total area of total9 is: " + total9);
		return total9;
	}

	@Override
	public int sister(int age3, String age4, int age5, int age6) {
		int total10 = age3 + Integer.parseInt(age4) + age5 + age6 - 100;
		System.out.println("Total area of total10 is: " + total10);
		return total10;
	}

	/*
	 * Static and final type method is not possible overriding.
	 */

	/*
	 * static int sister(int age1, int age2, int age3, int age5, int age6 ){ int
	 * total11= age1 + age2 + age3 + age5 + age6;
	 * System.out.println("Total  area from total11: " + total11); return total11; }
	 * 
	 * public final int sister(int age1, int age2, int age3, int age5) { int total12
	 * = age1 +age2 +age3 + age5; System.out.println("total area from s: " +total6);
	 * return total12; }
	 */

	/*
	 * method overriding: When different methods exist with the same method name
	 * with same parameters or signature but with different syntax or logic, it is
	 * called method overriding.
	 */
}
