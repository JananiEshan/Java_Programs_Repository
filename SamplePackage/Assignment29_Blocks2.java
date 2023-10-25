package SamplePackage;
class Third{
	void third_1(){
		System.out.println("Third_Nonstatic");
	}
	static void third_2(){
		System.out.println("Third_Static");
	}
}
abstract class Second extends Third{
	void Second_1(){
		System.out.println("Second_Nonstatic");
	}
	static void Second_2(){
		System.out.println("Second_Static");
	}
	abstract void Second_3() ;
}
public class Assignment29_Blocks2 extends Second {

	public static void main(String[] args) {
	Second_2();	
	third_2();
	Assignment29_Blocks2 cc= new Assignment29_Blocks2();
cc.third_1();
cc.Second_1();
cc.Second_3();
	}
	@Override
	void Second_3() {
		System.out.println("Abstract_Method_Overridden");
	}

}
