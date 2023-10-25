package SamplePackage;

public class Assignment12_Circle {
	double pi =3.14;
	
	void Circle()
	{
		int r = 2;
		double area = pi*r*r;
		System.out.println("Area of the Circle is :"+ area);
	}
	
	static void Circle2() {
		System.out.println("Thank you");
	}
	
	public static void main(String[] args) {
		// calling non static method
		Assignment12_Circle Object_1 = new Assignment12_Circle();
		Object_1.Circle();
		// calling static method
		Circle2();
	}
	

}
