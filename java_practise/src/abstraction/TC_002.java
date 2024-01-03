package abstraction;

public  class TC_002 extends Tc_001  {

	public static void main(String[] args) {
		
		TC_002 ab = new TC_002();
		ab.colour();
		System.out.println(ab.c);
				
		
	}

	@Override
	public void colour() {
		System.out.println("yellow");
		
	}

}
