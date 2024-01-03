package java_practise;

public class Nested_if {

	public static void main(String[] args) {
	 int x=60;
	 
	 if (x<50) {
		 if (x<40) { 
			 if (x<30) {
				 if (x<20) {
					 if(x==10) {
						 System.out.println("x is equal to 10");
					 }
				 }
			 }
		 }
	 }
	 
	 else System.out.println("x is not equal to 10");
	}
	

}
