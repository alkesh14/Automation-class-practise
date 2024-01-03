package java_practise;

import java.util.Scanner;

public class Assingment_3 {

	public static void main(String[] args) {
		int num1, num2, result;
		Scanner ab = new Scanner(System.in);
		System.out.println("choose any one from operation +,*,/,-)");
		String operation  = ab.next();
		System.out.println("entre first number ");
		num1 = ab.nextInt();
		System.out.println("entre second number ");
		num2 = ab.nextInt();

		switch (operation) {
		
		case "+":
			result = num1 + num2;
			System.out.println("addition of num1 and num2 is " + result);
			break;
			
		case "*":
			result=num1*num2;
			System.out.println("multiplication of nume 1 and num2 is "+ result);
			break;
			
		case"/":
			result=num1/num2;
			System.out.println("division of num 1 and num 2 is "+result);
			break;
		case"-":
			result=num1-num2;
			System.out.println("subtraction of num1 and num2 is "+result);
			break;
			default:
				System.out.println("invalid operator");

		}

	}

}
