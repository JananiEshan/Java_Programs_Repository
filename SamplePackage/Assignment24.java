package SamplePackage;
class Trial1{
	static void add() {	
		System.out.println("Addition");	
	}
	void sub() {
		System.out.println("Substraction");
	}
}

class Trial2 extends Trial1 {
	static void mul(){
		System.out.println("Multiplication");
	}	
}
class Assignment24 extends Trial2 {	
	void Div(){
		System.out.println("Division");
		
	}
	public static void main(String[] args) {
		Assignment24 cc=new Assignment24();
		add();
		cc.sub();
		mul();
		cc.Div();
	}

}
