package hw10Q2UseOfSuperInChildClass;

public class Father {
	public String name;
	public int age;
	public char sex;
	public boolean usCitizen;
	// We created this variables to use in child class to call by super keyword
	public String familyName;

	public Father() {
		System.out.println("this is a default constructor from father class.");
	}

	public Father(String name, int age, char sex, boolean usCitizen) {
//		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("Name: " + name + ", Age:" + age + ", Sex: " + sex + ", UsCitizen: " + usCitizen);
	}

	public void father() {
		System.out.println("this is a void type method from father class.");
	}

	public void fatherInfo(String name, int age, char sex, boolean usCitizen) {
//		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;

		System.out.println("name: " + name + ", age: " + age + ", sex: " + sex + ", UsCitizen: " + usCitizen);
	}
}
