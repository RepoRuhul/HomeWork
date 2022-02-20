package hw11Q3Abstraction.copy;

public class RockefellerUniversity extends EngineeringSchool implements AeronauticalSchool {

	public void maths() {
		System.out.println("This is non-abstract or implemented method and regular class.");
	}

	@Override
	public void aeronauticalInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mechanicalLab() {
		// TODO Auto-generated method stub
		
	}
}
