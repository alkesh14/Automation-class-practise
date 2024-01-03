package super_keyword;

public class Super_2 extends Super_1 {
	
	public Super_2(int z) {
		super();
		System.out.println("i am parameterized constructor from child class "+z);
	}
	int x = 10;
	int y = 15;

	public void template() {
		System.out.println("template from super 2");

	}

	public void execute() {
		System.out.println("execute from super 2");

	}
	

	public void getinfo() {
		System.out.println(super.x);
		super.execute();
	}

	public static void main(String[] args) {
		Super_2 a = new Super_2(50);
		a.getinfo();
	}

}
