package hw11Q2Polymorphism;

public class TestFamilyClass {
	public static void main(String[] args) {
	Sister si = new Sister();
	si.sister();
	si.sister(1,2);
	si.sister(3, 6, 7);
	si.sister(8, 9, 10, 11);
	si.sister(12, 13, 14, "60");
	si.sister(18, "66", 66, 5);
	Sister.sister(24, 22, 11, 44,66);//static method.
	
	
	Niece nc = new Niece();
	nc.sister();
	nc.sister(11, 10);
	nc.sister(20, 30, 40);
	nc.sister(30, 50, 80, 30);
	nc.sister(10, 40, 60, "88");
	
	
	}

}
