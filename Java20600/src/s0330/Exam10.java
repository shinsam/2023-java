package s0330;

import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//어떤수 N을 입력받아서 다음과 같은 모양 출력
		//N:3
		//1
		//12
		//123
		
		int N;
		Scanner sc = new Scanner(System.in);
		System.out.print("N:");
		N = sc.nextInt();
		for(int i = 1 ; i<=N ; i++)
		{
			for(int j = 1; j<=i ; j++)
		
				System.out.print(j + "\t");
			System.out.println();
		}
		
	}

}





