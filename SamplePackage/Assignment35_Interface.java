package SamplePackage;
interface try2{
	abstract void Once_2(); 
}
class Try1 implements try2{
	void Once_1()
	{	System.out.println("Hellooo One");
}
	@Override
	public void Once_2() {
		System.out.println("Class calling interface1");		
	}
}

interface try3{
	abstract void Once_3(); 
}
interface try4{
	abstract void Once_4(); 
}

public class Assignment35_Interface implements try3,try4{

	public static void main(String[] args) {
		
		Assignment35_Interface cc= new Assignment35_Interface();
		
		cc.Once_3();
		cc.Once_4();
		
		Try1 tt= new Try1();
		tt.Once_1();
		tt.Once_2();
		
	}
	@Override
	public void Once_3() {
		{
			System.out.println("Hellooo 2nd interface");
		}
		
	}

	@Override
	public void Once_4() {
		System.out.println("Hellooo 4th interface");
		
	}

}
