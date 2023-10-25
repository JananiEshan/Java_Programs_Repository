package SamplePackage;

import java.util.Scanner;

public class ExcerisePgm {	

	final  String University = "Anna University"; //Non static - Final Variable
	final static String CollegeName = "ABC"; // Static - Final Variable
	int Total=500; //Non static - Global Variable
	static int Outof = 300; //Static - Global Variable
	
	static void Student_Info() 
	{

		Scanner Object_1 = new Scanner(System.in);
		System.out.println(" Enter your Name");
		String Name= Object_1.next();
		System.out.println(" Student Name is :"+ Name);
		System.out.println(CollegeName);
		//System.out.println(University); // calling non static final variable inside static methos - throws error.
	}		
	void Student_Score() 
	{
		Scanner Object_1 = new Scanner(System.in);
		byte English= Object_1.nextByte(); // give values till 128
		System.out.println(" English Score :"+ English);
		short Maths = Object_1.nextShort();
		System.out.println(" English Score :"+Maths);
		System.out.println(Total);
		System.out.println(CollegeName);
		
	}
	
	public static void main(String[] args) {
		
		Student_Info();
		ExcerisePgm ss= new ExcerisePgm();
		ss.Student_Score();		
	}
}
