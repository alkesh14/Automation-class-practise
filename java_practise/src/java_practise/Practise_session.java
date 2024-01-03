package java_practise;

import java.util.Scanner;

public class Practise_session {

	public static void main(String[] args) {
		

  /*  Scanner sc=new Scanner (System.in);
   
    int a;
    int b;
    
    int c;
    int d;
    System.out.println("entre first value");
    a=sc.nextInt();
    
    System.out.println("entre second value");
    b=sc.nextInt();
   
    System.out.println("entre third  value");
    c=sc.nextInt();
    
    d=a+b+c	;
    System.out.println("addition of three numbers "+ d);  */
		
		
		Scanner ab=new Scanner(System.in);
		
		int a;
		int b;
		int c;
		int d;
		
		System.out.println("first value");
		a=ab.nextInt();
		
		System.out.println("second value");
		b=ab.nextInt();
		
		System.out.println("third value");
		c=ab.nextInt();
		
		d=a*b*c;
		System.out.println(d);
}

} 
