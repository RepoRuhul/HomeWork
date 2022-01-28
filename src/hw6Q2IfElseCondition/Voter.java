package hw6Q2IfElseCondition;

public class Voter {
	public static void main(String[] args) {
		int age = 39;
		if (age == 18) {
			System.out.println("i am a voter" + age);
		} else if (age < 18) {
			System.out.println("i am not a voter" + age);
		} else if (age >= 18) {
			System.out.println("i am a voter " + age);
		} else {
			System.out.println("please add a valid age" + age);
		}
	}
}
