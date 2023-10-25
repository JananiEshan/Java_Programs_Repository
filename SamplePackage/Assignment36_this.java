package SamplePackage;

public class Assignment36_this {

	Assignment36_this(){
		System.out.println("Hello First line");
	}
	
	Assignment36_this(int a){
		this();
		System.out.println("Hello Second line");
	}
	
	public static void main(String[] args) {
		
		Assignment36_this cc = new Assignment36_this(4);

	}
}
