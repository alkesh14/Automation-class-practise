package constructor_types;

public class Constructor {

	// user defined constructor

	public Constructor() {
		System.out.println("i am user defined constructor");
	}

	// parameterized constructor
	public Constructor(int x) {
		System.out.println("i am parameterized constructor " + x);
	}

	public static void main(String[] args) {

		Constructor t = new Constructor();
		Constructor t1 = new Constructor(10);
	}

}
