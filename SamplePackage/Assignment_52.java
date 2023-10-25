package SamplePackage;

public class Assignment_52 {

	public static void main(String[] args) {
		String [] Name = new String[3];
		int [] Age = new int[3];
		char [] Gender = new char[3];

		Name[0]="Ram";
		Name[1]="Laksman";
		Name[2]="Sita";
		
		Age[0] = 10;
		Age[1] = 20;
		Age[2] = 30;
		
		Gender[0]='M';
		Gender[1]='M';
		Gender[2]='F';
		
		System.out.println(Name[0].concat(" ").concat(Name[1]).concat(" ").concat(Name[2]));
		System.out.print(Age[0]);
		System.out.print("  "+Age[1]);
		System.out.println("  "+Age[2]);
		
		System.out.print(Gender[0]);
		System.out.print("   "+Gender[1]);
		System.out.print("   "+Gender[2]);
	}	
}
