package hw9Q2Encapsulation;

public class Employee {
	private String Name;
	private int Age;
	private char sex;
	private boolean usCitizen;

	public String getEmpName() {
		return Name;
	}

	public void setEmpName(String Name) {
		this.Name = Name;
	}

	public int getEmpAge() {
		return Age;
	}

	public void setEmpAge(int Age) {
		this.Age = Age;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public boolean isUsCitizen() {
		return usCitizen;
	}

	public void setUsCitizen(boolean usCitizen) {
		this.usCitizen = usCitizen;
	}
}
