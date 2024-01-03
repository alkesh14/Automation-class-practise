package this_keyword;

// using this keyword to call constructor inside constructor 

public class This_3 {
	int num;
	String type;
	public This_3() {
		System.out.println("its user defined constructor ");
	}
	public This_3(int num,String type) {
		this();
		this.num=num;
		this.type=type;
		System.out.println("its a parameterized constructor "+num);
		System.out.println("its a parameterized constructor "+ type);
		
	}

	public static void main(String[] args) {
		
		This_3 t=new This_3(50,"hello");
		

	}

}
