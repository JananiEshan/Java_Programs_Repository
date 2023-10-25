package SamplePackage;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment32_SingleException {

	public static void main(String[] args) {
		System.out.println("Enter the Value");
		Scanner sc =  new Scanner(System.in);
	
		try
		{
			int a = sc.nextInt();
			System.out.println("Interger Value"+a);
		}
		catch(InputMismatchException e)
		{
			System.out.println(e);
		}
		
finally
{
	System.out.println("DONE");
}
	}

}
