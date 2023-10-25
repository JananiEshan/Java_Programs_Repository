package SamplePackage;

import java.util.Scanner;

class Before{
				
		private String Name;
		public void setdetails(String Fname) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your Last Name");
			String LastName = sc.next();
			String FullName = Fname.concat(LastName);
			this.Name=FullName;
		}
		public String getdetails()
		{
			return Name;
		}
	}
	public class Assignment_58 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your  Serial Number");
		int Serialno = sc.nextInt();
		Before bb = new Before();
		bb.setdetails("Janani ");
		System.out.println(bb.getdetails());
	}

}
