package hw11Q3Abstraction.copy;

public class RockefellerUniversity extends EngineeringSchool implements AeronauticalSchool {

	public void maths() {
		System.out.println("This is non-abstract or implemented method and regular class.");
	}

	@Override
	public void aeronauticalInfo() {
		System.err.println("This aeronauticalInfo methos is come from AeronauticalSchool abstract class.");

	}

	@Override
	public void mechanicalLab() {
		System.out.println("This mechanicalLab method is come from EngineeringSchool Abstract class.");

	}
}
