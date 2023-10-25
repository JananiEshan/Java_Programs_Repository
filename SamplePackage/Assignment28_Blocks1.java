package SamplePackage;

public class Assignment28_Blocks1 {

	static {
		int a =1;
		System.out.println("SIB_1"+a);
	}
	static {
		int b =2;
		System.out.println("SIB_2"+b);
	}
	{
		int c =3;
		System.out.println("IIB_1"+c);
	}
	{
		int d =4;
		System.out.println("IIB_1"+d);
	}
	Assignment28_Blocks1 () {
		int e=5;
		System.out.println("Constructor_1"+e);
	}
	Assignment28_Blocks1 (int f) {
		
		System.out.println("Constructor_2"+f);
	}
	void Eight() {
		int g=8;
		System.out.println("Non_Static Method"+g);
	}
	static void Nine() {
		int h=8;
		System.out.println("Static Method"+h);
	}
	public static void main(String[] args) {

		Assignment28_Blocks1 cc = new Assignment28_Blocks1();
		new Assignment28_Blocks1(5);
	cc.Eight();
	Nine();
	
	}		
}
