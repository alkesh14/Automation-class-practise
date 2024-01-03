package overloading;

public class Method_verloading {
	
	public void add (int x) {
		System.out.println("add method with int data type");
	
	}
	public void add(float x) {
		System.out.println("add method with float data type");
	
	}
	public void add (double x) {
		System.out.println("add method with double data type");
	}
	
	

	public static void main(String[] args) {
		
		Method_verloading m= new Method_verloading();
		m.add(10);
		m.add(14.5f);
		m.add(20.43);

	}

}
