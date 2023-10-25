package SamplePackage;

public class Assignment37_Stage1 {

	public void add() {
		
		System.out.println("Public Method");
	}
private void subs() {
	System.out.println("Private Method");
	}
protected void mul() {
	System.out.println("Protected Method");
}
 void divs() {
	 System.out.println("Default Method");
}
	
	public static void main(String[] args) {
		Assignment37_Stage1 cc= new Assignment37_Stage1();
		cc.add();
		cc.subs();
		cc.mul();
		cc.divs();

	}

}
