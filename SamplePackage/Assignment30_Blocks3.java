package SamplePackage;
class Third2{
	void third_1(){
		System.out.println("Third_Nonstatic");
	}
	static void third_2(){
		System.out.println("Third_Static");
	}
}
abstract class Second2 extends Third2{
	void Second_1(){
		System.out.println("Second_Nonstatic");
	}
	static void Second_2(){
		System.out.println("Second_Static");
	}
	abstract void Second_3() ;
}
public class Assignment30_Blocks3 extends Second2 {

	public static void main(String[] args) {
	Second_2();	
	third_2();
	Assignment30_Blocks3 cc= new Assignment30_Blocks3();
cc.third_1();
cc.Second_1();
cc.Second_3();
	}
	@Override
	void Second_3() {
		System.out.println("Abstract_Method_Overridden");
	}

}
