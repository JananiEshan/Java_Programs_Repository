package SamplePackage;

public class Constructor_Overloading {

	Constructor_Overloading () {
	System.out.println("Normal Constructor");
	}
	// Constructor Overloading//
	Constructor_Overloading (int a,double b) {
		System.out.println(a);
	}
	
	Constructor_Overloading(float c, char d)
	{
		System.out.println (c + d);
	}
	
	Constructor_Overloading(String e)
	{
		System.out.println (e);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Constructor_Overloading();
		new Constructor_Overloading (50,5.5);
		new Constructor_Overloading (5.52f,'E');
		new Constructor_Overloading ("Eshan");
		}

}
