package SamplePackage;

public class Assignment42_StringFunctions {

	public static void main(String[] args) {
		String a ="JANANI";
		String b = "ranjith";
		String c = " Work Hard ";
		String d = "Work Hard";
		String e = "God Bless";
		System.out.println(a.length());
		System.out.println(b.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(b.charAt(3));
		System.out.println(b.indexOf('r'));
		System.out.println(c.substring(6));
		System.out.println(d.substring(0,8));
		System.out.println(c.trim());
		System.out.println(e.contains("Z"));
		System.out.println(e.contains("B"));
		System.out.println(c.isEmpty());
		System.out.println(a.concat(" ").concat("loves").concat(" ").concat("Ranjith"));
	}

}
