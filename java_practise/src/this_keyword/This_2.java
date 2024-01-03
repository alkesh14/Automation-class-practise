package this_keyword;
// this keyword to invoke instance method 
public class This_2 {

	public void sample1() {
		System.out.println("sample 1 method");
	}

	public void sample2() {
		this.sample1();
		System.out.println("sample 2 method");
	}

	public static void main(String[] args) {

		This_2 t1 = new This_2();
		t1.sample2();
	}

}
