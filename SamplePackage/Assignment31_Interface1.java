package SamplePackage;

interface One{
int b = 5;

	void One_1(int a);
}

public class Assignment31_Interface1 implements One {

	public static void main(String[] args) {
		Assignment31_Interface1 cc = new Assignment31_Interface1();
		cc.One_1(5);
		System.out.println(cc.b);
	}

	@Override
	public void One_1(int a) {
	
		System.out.println("Calling Interface Method"+a);
		
	}

}
