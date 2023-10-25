package SamplePackage;

public class SampleClass {
// Constructor
	
	SampleClass () {
		System.out.println("Calling Constructor");
	}
		
// 	static Method //
	static void Method1 (int a) {
		
		System.out.println("Static" + a);
	}
//Non static Method//	
	void add() {
		System.out.println(" I am Non static Method");
	}

	
	public static void main(String[] args) {
	
		SampleClass obj1 = new SampleClass();
		Method1(5);
		obj1.add();
		new SampleClass(); //another type of calling the constructor
		
		
		
	}

}
