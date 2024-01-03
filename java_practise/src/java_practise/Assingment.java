package java_practise;

public class Assingment {

	int x = 25;
	int y = 50;
	int z = x + y;

	public void m1() {
		if (x < y) {
			System.out.println("x is less than y");
		} else if (y < z) {
			System.out.println("y is less than z ");
		} else if (z > x) {
			System.out.println("z is greater than x");

		} else {
			System.out.println("invalid comparison");
		}
	}

	public void m2() {
		if (x < y) {
			System.out.println("x is less than y");
			if (y < z) {
				System.out.println("y is less than z");
				if (z > x) {
					System.out.println("z is greater than x ");

				}
			}
		} else {
			System.out.println("invalid comparison");
		}
	}

	public static void main(String[] args) {

		Assingment ab = new Assingment();
		ab.m1();;

	}

}
