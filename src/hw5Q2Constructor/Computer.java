package hw5Q2Constructor;

public class Computer {

	public String brand;
	public String model;
	public String operatingSystem;
	public int price;
	public char grade;
	public boolean madeInUSA;

	public Computer() {
		System.out.println("this is default constructor from computer class");

	}

	public Computer(String brand, String model, String operatingSystem, int price, char grade, boolean madeInUSA) {
		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.grade = grade;
		this.madeInUSA = madeInUSA;
		System.out.println("My brand " + brand + "Model " + model + " OperatingSysterem " + operatingSystem + "Price "
				+ price + "grade " + grade + " MadeInUSA " + madeInUSA);

		this.grade = grade;
		this.madeInUSA = madeInUSA;

	}

}
