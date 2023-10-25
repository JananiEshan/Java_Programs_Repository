package SamplePackage;

import SamplePackage_Old.Assignment40_Stage3_Parent;

public class Assignment40_Stage3 extends Assignment40_Stage3_Parent
{
	public static void main(String[] args) {
		Assignment40_Stage3 cc= new Assignment40_Stage3();
		cc.add();
	//cc.subs(); // since this is private method, we cannot access outside of the class even though it's in same package.
		cc.mul();
		//cc.divs(); // since this is Default method, we cannot access outside of the class even though it's in same package.

	}

}
