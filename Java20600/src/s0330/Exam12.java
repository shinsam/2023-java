package s0330;

import java.util.Scanner;

public class Exam12 {

	public static void main(String[] args) {
		// break를 이용하여 입력된 N까지만 출력하시오
		// 단,N의 가장 큰 값은 100 
		// 입력)N: 5
		// 출력)1 2 3 4
		
		int N;
		Scanner sc = new Scanner(System.in);
		System.out.print("N:");
		N = sc.nextInt();
		for(int i = 1; i<=100 ; i++) {
			if(i==N)
				break;
			System.out.print(i+"\t");
			
		}
		
		////
		System.out.println();
		System.out.println("---------------");
		// 입력)N: 4
		// 출력)1 2 3 5 6 7 8 9 10
		for(int i = 1; i<=10 ; i++) {
			if(i==N)
				continue;
			System.out.print(i+"\t");
			
		}
	}

}










