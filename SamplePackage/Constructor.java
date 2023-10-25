package SamplePackage;

public class Constructor {
// Constructor
	
	Constructor () {
		System.out.println("Calling Constructor");
	}
	
	Constructor (int a) {
		this();
		System.out.println("Calling Constructor with parameterized");
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
	
	// One method of calling constructor directly without calling object	
	   Constructor obj1 = new Constructor();	
	Method1(5); // calling static method
		obj1.add(); // calling non static method
		// Another method of calling constructor directly without calling object	
				new Constructor(5);//another type of calling the constructor
		
		
		
	}

}
