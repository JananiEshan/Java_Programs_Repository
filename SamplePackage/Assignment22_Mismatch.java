package SamplePackage;

import java.util.Scanner;

public class Assignment22_Mismatch {

	static void addition()
	{
		System.out.println("Enter Input1");
		Scanner sc1= new Scanner(System.in);
		int input1 = sc1.nextInt();
		
		System.out.println("Enter Input2");
		int input2 = sc1.nextInt();
	int c = input1+input2;
	System.out.println(" Addition Result" +c);
	}
	
	static void Subtraction()
	{
		System.out.println("Enter Input1");
		Scanner sc1= new Scanner(System.in);
		int input1 = sc1.nextInt();
		
		System.out.println("Enter Input2");
		int input2 = sc1.nextInt();
	int c = input1-input2;
	System.out.println(" Addition Result" +c);
	}
	public static void main (String[] args)
	{
	addition();
	Subtraction();
	}
	}

