package java_practise;

public class Assingment_patterns {

	public static void main(String[] args) {
		// o-1 trangle
//		1
//		0 1
//		1 0 1
//		0 1 0 1
//		1 0 1 0 1

//		int row=5;
//		for(int i=1;i<=row;i++) {
//			
//			for(int j=1;j<=i;j++) {
//				int sum=i+j;
//
//				if(sum%2==0) {
//					System.out.print(1+" ");
//				
//		}else { System.out.print(0+" ");
//		}
//	}
//	System.out.println();
//}

		//2- half pyramid with numbers
//		1
//		1 2
//		1 2 3
//		1 2 3 4
//		1 2 3 4 5
		
		
//		int row = 5;
//		for (int i = 1; i <= row; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}
		
		//3-inverted half pyramid with numbers
//		1 2 3 4 5
//		1 2 3 4
//		1 2 3
//		1 2
//		1
		
//		int row=5;
//		for(int i=row;i>=1;i--) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j+" ");
//			}System.out.println();
//		}
//		
		
		
		//4-floyds triangle
//		1
//		2 3
//		4 5 6
//		7 8 9 10
//		11 12 13 14 15
		
//		int row=5;
//		int number=1;
//		for(int i=1;i<=row;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(number+" ");
//				number++;
//			}System.out.println();
//		}
//		
		
		// 5- solid rectangle
//		* * * * *
//		* * * * *
//		* * * * *
//		* * * * *
		
//		int row=4;
//		int col=5;
//		for(int i=1;i<=row;i++) {
//			for (int j=1;j<=col;j++) {
//				System.out.print("*  ");
//			
//			}System.out.println();
//		}
//		
		
		
		//6-hollow rectangle
//		* * * * *
//		*       *
//		*       *
//		* * * * *
		
//		int row =4;
//		int col=5;
//		for(int i=1;i<=row;i++) {
//			for(int j=1;j<=col;j++) {
//				if(i== 1 || i==row || j==1 || j==col) {
//					System.out.print(" *");
//				}else System.out.print("  ");
//			}System.out.println();
//		}
		
		
		
		//7-half pyramid 
//		*
//		* *
//		* * *
//		* * * *
		
//		int row=4;
//		for(int i=1;i<=row;i++) {
//			for (int j=1;j<=i;j++) {
//				System.out.print(" *");
//			}
//			System.out.println();
//		}
		
		
		//8-inverted half pyramid
//		* * * *
//		* * *
//		* *
//		*
		
		int row=4;
		for(int i=row;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
