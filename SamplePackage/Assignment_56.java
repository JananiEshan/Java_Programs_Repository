package SamplePackage;
import java.util.Scanner;
public class Assignment_56 {
	public static void main(String[] args) {
		System.out.println("Choose and perform your operations as 1 or 2");
			Scanner S1 = new Scanner(System.in);
			int value = S1.nextInt();
		if(value==1 || value==2)
		{	
		switch(value)
		{		
	case 1:	
		Scanner S2 = new Scanner(System.in);
		System.out.println("Enter 2 values");
		int Input10=S2.nextInt();
		int Input20=S2.nextInt();
		int c = Input10+Input20;
		System.out.println("Addition  "+c);
	case 2:	
		
		System.out.println("Enter 2 values");
		Scanner S22 = new Scanner(System.in);
		int Input11=S22.nextInt();
		int Input22=S22.nextInt();
		int d = Input11-Input22;
		System.out.println("Subtraction  "+d);	
		}
		System.out.println("Invalid Operation entered");
		}
		
	}
	
}
