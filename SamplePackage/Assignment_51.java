package SamplePackage;

public class Assignment_51 {

	public static void main(String[] args) {
		String Input1 = "Manish";
		
		/*Input : Manish
Output : MaNiSh
		
System.out.print(Input1.substring(0,2));
String Input2 = Input1.toUpperCase();

System.out.print(Input2.charAt(2));
System.out.print(Input1.substring(3)); */
		String One=Input1.substring(0,2);
		String aa=Input1.substring(2, 3);
		String Two= aa.toUpperCase();
	
		String Three=Input1.substring(3,4);
		
		String bb=Input1.substring(4, 5);
		String Four= bb.toUpperCase();
		String Five = Input1.substring(5,6);
	
	System.out.println(One+Two+Three+Four+Five);
	
	}
	

}
