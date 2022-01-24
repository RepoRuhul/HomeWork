package hw3Q2JavaVariables;

public class AboutMe {
	public String name; // here declared the variable.

	public String name1 = "Ruhul"; // here initialized variable, i assigned value in the variable.
	public byte age = 40;
	public short s = 1000;
	public int i = 3000;
	public char sex = 'M';
	public boolean result = true;
	public long card_number = 1234567890;
	public double grade = 4.99;
	public float height = 5.7f;

	public static void main(String[] args) { // here is main method implemented.

		// AboutMe is class aboutMe is an objector reference variable.
		// this action(when an object is created
		// its called instantiated.
		AboutMe aboutMe = new AboutMe();
		System.out.println(aboutMe.name1);
		System.out.println(aboutMe.age);
		System.out.println(aboutMe.sex);
		System.out.println(aboutMe.name1 + aboutMe.age + aboutMe.sex);
		System.out
				.println("my name: " + aboutMe.name1 + " my age: " + aboutMe.age + " my sex:" + aboutMe.sex);

	}

}
