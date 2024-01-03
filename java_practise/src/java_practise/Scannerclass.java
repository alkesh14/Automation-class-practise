package java_practise;

import java.util.Scanner;

public class Scannerclass {

	public static void main(String[] args) {
		int ace;
		int a=50;
		int b=25;
		Scanner at= new Scanner(System.in);
		
        ace=at.nextInt();   
     switch(ace) 
     {
     case 1:
    	 System.out.println("addition ="+ (a+b));
    	 break;
     case 2:
    	 System.out.println("multiplication="+ (a*b));
         break;
     case 3:
    	 System.out.println("subtraction="+(a-b));
    	 break;
    default:
    	System.out.println("No mathematic operation");
     }
	}

}
