package SamplePackage;

public class Assignment3_IfBlock {

	public static void main(String[] args) {
		
		int English = 100;
		int Maths = 200;
		
		// All Four condition should not be Executed
		
	// First Condition	
		if(English<45 && Maths>45) {
			System.out.println("Person scored more than 45, So he is passed");
		}
	// Second Condition	
		if(English<45 || Maths>300) {
			System.out.println("In English he scored more than 45, So he is passed");
		}

	// Third Condition	
		if(!(English<500 && Maths<500)) {
			System.out.println("Third Condition, he failed to score more than 500 in both the subject");
		}
	// Fourth Condition	
				if(!(English<450 || Maths<450)) {
					System.out.println("Forth Condition,he failed to score more than 500 in both the subject");
				}

				System.out.println(" None of the Conditions is Executed");
	}

}
