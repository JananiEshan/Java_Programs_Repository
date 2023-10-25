package SamplePackage;

class Assignment39{
	static int a = 50;
	 int b = 500;
	void add()
	{
		a=100;
		System.out.println("Without keyword print a value"+a);
	}
	void add(int b)
	{
		this.add();
		System.out.println("Without keyword print a value"+b);
	}
}

public class Assignment39_thiskeyword {

	public static void main(String[] args) {
		
		Assignment39 cc = new Assignment39();
		cc.add(500);
		
	}

}
