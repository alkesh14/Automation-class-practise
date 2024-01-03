package java_practise;

public class Variable_practise {
	int x;
	int y;
	
	public void add(int a) {
	
	x=a;
	}
	public void sub (int b) {
		y=b;
	}
	
	public void varible() {
		System.out.println("value of variable x is "+x );
		System.out.println("Value of variable y is "+y);
		
	}

	public static void main(String[] args) {
		Variable_practise at=new Variable_practise();
		at.add(25);
		at.sub(60);
		at.varible();
		

	}

}
