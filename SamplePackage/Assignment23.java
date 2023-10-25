package SamplePackage;

class Sample {
	// calling non static and static variable for practice
		int a =5;
		static int b=10;
		
	void one() {
		System.out.println("Hello");
	}
	
	static void two() {
		System.out.println("Vanakam");
	}
}

public class Assignment23 extends Sample {
	
static	void three() {
		System.out.println("Namasthe");
	}
	
void four() {
	System.out.println("Namaskara");
}
	public static void main(String[] args) {
		Assignment23 cc= new Assignment23();
		cc.one();
		System.out.println(cc.a);
		System.out.println(b);
		two();
		three();
		cc.four();
	}
}
