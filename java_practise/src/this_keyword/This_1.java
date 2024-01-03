package this_keyword;

public class This_1 {
	
	// instance variable 
	int x;
	String city;
	double d;
	
	public This_1(int x,String city,double d) {
		this.x=x;
		this.city=city;
		this.d=d;
		System.out.println(this.x);
		System.out.println(this.city);
		System.out.println(this.d);
		
	}
	

	public static void main(String[] args) {
	 This_1 t1 = new This_1(15,"hello",15.5);
		

	}

}
