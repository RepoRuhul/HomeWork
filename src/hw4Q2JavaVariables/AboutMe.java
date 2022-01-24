package hw4Q2JavaVariables;

public class AboutMe {
	// Declared variables.
	public String About_me;
	public String name;
	public byte age;
	public short my_yearly_rent;
	public int my_yearly_salary;
	public char sex;
	public boolean us_citizen;
	public long my_bank_balance;
	public double grade;
	public float height;

	public AboutMe() {
		System.out.println("this is all about me: ");
	}

	public void aboutMe() {
		System.out.println("my name is: " + name + " my age is: " + age + " my sex is: " + sex + " my yearly salary: "
				+ my_yearly_salary + " my yearly rent: " + my_yearly_rent + " my bank balance: " + my_bank_balance
				+ " my grade: " + grade + " my heigh: " + height);
	}
}
