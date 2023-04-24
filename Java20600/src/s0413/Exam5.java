package s0413;

import java.util.Scanner;

public class Exam5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력:");
		int num = sc.nextInt();
		int sum = 0;
//		for(int i = 1 ; i<=num ; i++) {
//			if( i %2 == 0 ) {//짝수
//				sum -=i;
//				System.out.print("-" + i);
//			}else {//홀수
//				sum +=i;
//				System.out.print("+" + i);
//			}
//		}
		int i = 1;
		while( i <=num) {
			if( i %2 == 0 ) {//짝수
			sum -=i;
			System.out.print("-" + i);
		}else {//홀수
			sum +=i;
			System.out.print("+" + i);
		}
			i++;
		}
		
		
		
		
		System.out.println("=" + sum);
	}

}




