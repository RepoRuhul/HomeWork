package hw11Q2Polymorphism;

//2) Create a package "hw11Q2Polymorphism" inside your HW project and execute the remaining. Read the question very carefully. Create a class Sister. Can you create several methods with the same name (sister) inside it with the help of below variables? As a variable, use int age1, int age2, int age3, String age4, int age5, int age6 etc in different combination. Use void type, parameterized type, return type, static type, final type method by different combinations of the above variable. Tell me what is the Method overloading by multiple line comments. initialize all the methods in TestFamily class. Create another class Niece and inherit (extends) Sister. Override all the possible methods by changing logic. If some methods are not possible to override, please explain why by the multiple line comments comments. Tell me what is the Method overriding by multiple line comments. Initialize all the methods of Niece class in TestFamily class.
		
public class Sister {
	//void type method is implemented.
	public void sister() {
		System.out.println("This is a void type method from sister class.");
	}
	//void type parameterized method is implemented.
	public void sister(int age1, int age2) {
		int total1 = age1 + age2;
		System.out.println("Total area from sister class.");
	}
	//Return type parameterized method is implemented.
	public int sister(int age1, int age2, int age3) {
		int total2 = age1 +age2 + age3;
		System.out.println("total area from total2:"  + total2 );
		return total2;
	}
	
	//Return type parameterized method is implemented.
	//but here one of the signature or parameter is string type.
		public int sister(int age1, int age2, int age3, String age4) {
			int total3 = age1 +age2 + age3;
			System.out.println("total area from total2:"  + total3 );
			return total3;
		}
		
		



}
