package SamplePackage;


class Trail_1{
	Trail_1(){
		System.out.println("First Call Method");
	}
}

public class Assignment34_Supercalling extends Trail_1 {

	Assignment34_Supercalling(){
		super();
		System.out.println("Main Method");
	}
	
	public static void main(String[] args) {
	
new Assignment34_Supercalling();
	}

}
