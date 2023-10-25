package SamplePackage;

abstract class Sample1{
	abstract void add();
	void sub() {
		System.out.println("Substraction");
	}

}

class Sample2 extends Sample1 {
	void mul(){
		System.out.println("Multiplication");
	}
	void Div(){
		System.out.println("Summa");
		
	}
	@Override
	void add() {	
		System.out.println("Addition");	
	}	
}
class Assignment26_27 extends Sample2 {	
	void Div(){
		System.out.println("Division");
		
	}
	public static void main(String[] args) {
	
		Assignment26_27 cc= new Assignment26_27();
	cc.add();
	cc.sub();
	cc.mul();
	cc.Div();
	}
	}

