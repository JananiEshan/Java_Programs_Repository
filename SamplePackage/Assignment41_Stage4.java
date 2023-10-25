package SamplePackage;

import SamplePackage_Old.Assignment40_Stage3_Parent;

// Accessing the Assignment40_Stage3_Parent class methods from different package.


public class Assignment41_Stage4 {

	public static void main(String[] args) {
		
		
		Assignment40_Stage3_Parent cc = new Assignment40_Stage3_Parent();
		cc.add();
		// cc.subs();// since this is private method, we cannot access outside of the class even though it's in same package.
		// cc.mul();// since this is protected method, we cannot access outside of the class even though it's in same package.
		//cc.divs(); // since this is default method, we cannot access outside of the class even though it's in same package.

	}

}
