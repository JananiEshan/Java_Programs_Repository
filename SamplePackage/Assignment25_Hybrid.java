package SamplePackage;

class C2{
	void One() {
		System.out.println("ONE");
	}
}

class C3 extends C2{
	void Two() {
		System.out.println("TWO");
	}
}

public class Assignment25_Hybrid extends C3{

	public static void main(String[] args) {
		Assignment25_Hybrid cc= new Assignment25_Hybrid();
		cc.One();
		cc.Two();
		C1 aa= new C1();
		aa.three();
	}

}

class C1 extends C2{
	void three() {
		System.out.println("THREE");
	}
}
