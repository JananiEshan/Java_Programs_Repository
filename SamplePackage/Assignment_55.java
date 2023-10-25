package SamplePackage;

import java.util.Scanner;

public class Assignment_55 {

	public static void main(String[] args) {
		String [] City = new String[3];
		//boolean [] Array2 = new boolean[3];
		String Message = "True";

		City[0]="Bangalore";
		City[1]="Kerala";
		City[2]="Tamilnadu";	
		Scanner S1 = new Scanner(System.in);
		
		for (int i=0;i<3;i++) {
			
			System.out.println("Have you visited  "+City[i]);
			String one = S1.next();
			String status ="Yes i visited";
		
			if(one =="yes") 
			{
		
			System.out.println(status);
			}
			
			
		}
	}
		
}