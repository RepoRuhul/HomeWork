package hw9Q2Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setEmpName("Raha");
		employee.setEmpAge(20);
		employee.setSex('F');
		employee.setUsCitizen(true);

		System.out.println("Employee Name: " + employee.getEmpName() + ", \nAge: " + employee.getEmpAge() + ", \nSex: "
				+ employee.getSex() + ", \nUs citizen ?  Ans: " + employee.isUsCitizen());
	}
}
