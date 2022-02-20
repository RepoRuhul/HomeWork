package hw11Q2Polymorphism;

public class Sister {

	public void sister() {
		System.out.println("This is a void type method which come from sister class.");
	}

	public void sister(int age1, int age2) {
		int total1 = age1 + age2;
		System.out.println("Total area of total1 is: " + total1);
	}

	public int sister(int age1, int age2, int age3) {
		int total2 = age1 + age2 + age3 + 84;
		System.out.println("Total area of total2 is: " + total2);
		return total2;
	}

	public int sister(int age1, int age2, int age3, String age4) {
		int total3 = age1 + age2 + age3 + Integer.parseInt(age4);
		System.out.println("Total area of total3 is: " + total3);
		return total3;
	}

	public int sister(int age3, String age4, int age5, int age6) {
		int total4 = age3 + Integer.parseInt(age4) + age5 + age6;
		System.out.println("Total area of total4 is: " + total4);
		return total4;
	}

	public static int sister(int age1, int age2, int age3, int age5, int age6) {
		int total5 = age1 + age2 + age3 + age5 + age6;
		System.out.println("Total area of total5 is: " + total5);
		return total5;
	}

	public final int sister(int age1, int age2, int age3, int age5) {
		int total6 = age1 + age2 + age3 + age5;
		System.out.println("Total area of total6 is: " + total6);
		return total6;
	}

	/*
	 * Method Overloading: When different methods exist with the same method name
	 * but with different parameters or signature, it is called method overloading.
	 */
}
