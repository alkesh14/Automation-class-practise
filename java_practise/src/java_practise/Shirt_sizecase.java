package java_practise;

import java.util.Scanner;

public class Shirt_sizecase {

	public static void main(String[] args) {
		int size;
		System.out.println("What is your size");
		Scanner ab=new Scanner (System.in);
		size=ab.nextInt();
		
		switch (size) {
		
		case 34:
			System.out.println(34+" Is A small size");
			break;
		case 36:
			System.out.println(36+" Is a small size");
			break;
		case 38:
			System.out.println(38+" Is a medium size");
			break;
		case 40:
			System.out.println(40+"Is a medium size ");
			break;
		case 42: 
			System.out.println(42+"Is a large size");
			break;
		case 44:
			System.out.println(44+ "Is a large size");
			break;
		case 46:
			System.out.println(46+ "is a extra large size");
			break;
		default :
           System.out.println("Size is not available");
		
   		}
		

	}

}
