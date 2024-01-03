package inhertance;

public class Child extends parent_1 {
	public void name() {
		System.out.println("name method from child class");
	}

	public static void main(String[] args) {

//		Child a = new Child();
//		a.advantage();
//		a.venture();
//		a.name();
//		
//		parent_1 p=new Child();
//		p.advantage();
//		p.venture();
//		
		parent_1	p=new parent_1();
		p.advantage();
		p.venture();
	}

}
