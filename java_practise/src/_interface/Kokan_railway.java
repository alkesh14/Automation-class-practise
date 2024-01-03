package _interface;

public class Kokan_railway implements Indian_railway,Distance{

	public static void main(String[] args) {
		Kokan_railway ab =new Kokan_railway();

		ab.green(4);
		ab.yello();
		ab.red();
		ab.distance();
	}

	@Override
	public void green(int x) {
		System.out.println("Proceed with 90 kmph");
		
	}

	@Override
	public void yello() {
		System.out.println("proceed with 40kmph");
		
	}

	@Override
	public void red() {
		System.out.println("stop here");
		
	}

	@Override
	public void distance() {
	 System.out.println("distance is 400 meter ");
		
	}

}
