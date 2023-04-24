package s0413;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] num = new int[5];
		int max = 0;
		
		System.out.println("정수 5개를 입력해주세요");
		int i = 0;
		while( i< 5 ) {
			System.out.print((i+1)+"번째 정수:");
			num[i] = sc.nextInt();
			
			if(num[i]  >  max)
				max = num[i];
			i++;
		}
		
		System.out.println("입력한 값들 중 최대값은" + max + "입니다.");
	}

}




