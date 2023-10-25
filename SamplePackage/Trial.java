package SamplePackage;

class Authentication {
	private int Phonenumber = 121212;
	
	public void setPhnumber(int Pnumber) {
		this.Phonenumber = Pnumber;
	}
	public int getPhnumber()
	{
		return Phonenumber;
	}
}

public class Trial {
	public static void main(String[] args) {
		Authentication cc = new Authentication();
		cc.setPhnumber(1254);
		System.out.println(cc.getPhnumber());
	}

}
