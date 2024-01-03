package java_practise;

public class String_class {

	public static void main(String[] args) {
		String s = "welcome to maharashtra";
		if (s.contains("to")) {
			System.out.println("to is present in string");
		}
		String a = "phone";
		if (a.equals("phone")) {
			System.out.println("string is equal");
		}
		if (a.equalsIgnoreCase("PHONE")) {
			System.out.println("string is not case sensitive");

		}
		if (a.endsWith("e")) {
			System.out.println("string ends with e ");
		}
	}

}
