package hw4Q2JavaVariables;

public class AboutMeTest {
	public static void main(String[] args) {
		// aboutMe class is instantiated. always inside main method, not in other
		// method.
		AboutMe aboutMe = new AboutMe();
		// initialized all variable here.
		aboutMe.name = "ruhul";
		aboutMe.age = 39;
		aboutMe.sex = 'M';
		aboutMe.my_yearly_salary = 100000;
		aboutMe.my_yearly_rent = 20000;
		aboutMe.us_citizen = true;
		aboutMe.my_bank_balance = 50000;
		aboutMe.grade = 4.92;
		aboutMe.height = 4.7f;
		// aboutMe class is initiated here.
		aboutMe.aboutMe();
		System.out.println("\n***************\n");
		// initialized all variable here.
		AboutMe aboutMe1 = new AboutMe();
		aboutMe1.name = "Alex";
		aboutMe1.age = 39;
		aboutMe1.my_yearly_salary = 300000;
		aboutMe1.my_yearly_rent = 20000;
		aboutMe1.us_citizen = false;
		aboutMe1.my_bank_balance = 70000;
	}
}
