package s0330;

import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//어떤수 N을 입력받아
		//N까지의 짝수의 합과 홀수의 합을 출력하시오
		
		int N;
		int even_sum=0 , odd_sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("N입력:");
		N = sc.nextInt();
		
		for(int i = 1 ; i<=N ; i++)
			if(i%2==0)
				even_sum += i;
			else
				odd_sum += i;
		
		System.out.print("1부터 " + N + "까지의");
		System.out.print(" 짝수의 합은 " + even_sum);
		System.out.print(" 홀수의 합은 " + odd_sum);
	}
}







