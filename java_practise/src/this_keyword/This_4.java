package this_keyword;

public class This_4 {
	// executing all constructor in class
	public This_4() {
		System.out.println("its user defined constructor");
	}

	public This_4(int x) {
		this();
		System.out.println("its parameterized constructor with one parameter " + x);
	}

	public This_4(int x, int y) {
		this(25);
		System.out.println("its parameterized constructor with two parameter " + x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		This_4 t1 = new This_4(50, 60);

	}

}
