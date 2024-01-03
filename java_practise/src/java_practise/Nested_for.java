package java_practise;

public class Nested_for {

	public static void main(String[] args) {

//		int row = 5;
//		for (int i = 1; i <= row; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("* ");
//			}
//
//			System.out.println();
//		}

//		int row1 = 5;
//		for (int a = row1; a >= 1; a--) {
//			for (int  b= 1; b <= a; b++) {
//				System.out.print(b+" ");
//			}
//			System.out.println();
//		}
		int row = 4;
		int number = 1;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(number + " ");
				number++;

			}
			System.out.println();
		}
		
//		int n=6;
//		for (int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				System.out.print("j ");
//			}
//			System.out.println();
//		}
	}


}
