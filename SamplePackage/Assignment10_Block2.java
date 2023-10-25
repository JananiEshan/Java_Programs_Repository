package SamplePackage;

public class Assignment10_Block2 {

	// Create 2 SIB , 2 IIB , 2 Constructor (Parameterized) , 
	// 1 Non-Static Method (Non-Parameterized) ,1 Static Method (Non-Parameterized)
	// Find Output
	
	//SIB
		static
		{
			System.out.println("This is my First SIB Output");
		}
		static
		{
			System.out.println("This is my Second SIB Output");
		}
	
	//IIB	
	    {
		int a = 5;
			System.out.println("This is my First IIB Output" + a);
		}
		{
		int a = 5;
			System.out.println("This is my Second IIB Output" + a);
		}
	// Constructor
		Assignment10_Block2(int a)
		{
			System.out.println("This is my First Constructor Output" + a);
		}
		Assignment10_Block2(double b)
		{
			System.out.println("This is my Second Constructor Output" + b);
		}
	public Assignment10_Block2() {
			// TODO Auto-generated constructor stub
		}
		// Non Static Method
		void block()
		{
			System.out.println("This is Non Static Output");
		}
		
	// Static Method
		static void chain()
		{
			System.out.println("This is Static Output");
		}
		
		public static void main(String[] args) {
			
			new Assignment10_Block2(2);
			new Assignment10_Block2(2.0);
			Assignment10_Block2 Object_1= new Assignment10_Block2();
			Object_1.block();
			chain();
					}

	}
