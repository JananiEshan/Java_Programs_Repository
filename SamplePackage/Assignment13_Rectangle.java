package SamplePackage;

public class Assignment13_Rectangle {
	
		int length = 10; // global
		 int breath = 10; // global
		
		void Rectangle1() {
			int length = 5;
			int breath = 5;
			int area = length*breath;
				System.out.println("Area of the Rectangle is :"+ area);
	}
			
		void Triangle1() {
			int length = 100;
			int breath = 2;
			int c = length*breath;
			double area = 0.5 *c;
				System.out.println("Area of the Triangle is :"+ area);
	}
		static void square1()
		{
				int a = 3;
				int Areasquare = a*a;
			
				System.out.println("Static Method ----> Area of the Square is :"+Areasquare);
			}

	
	public static void main(String[] args) {
		// calling non static method
		Assignment13_Rectangle Object_1 = new Assignment13_Rectangle();
		Object_1.Rectangle1();
		Object_1.Triangle1();
		// calling static method
		square1();
		
	
		
	}

}
