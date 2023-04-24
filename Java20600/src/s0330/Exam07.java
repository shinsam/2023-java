package s0330;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SWITCH CASE문을 이용하여
		//정수를 입력 받아서 3의 배수인지 출력
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력:");
		a = sc.nextInt();
		
		switch (a%3) {
		case 0: 
			System.out.println(a + "는 3의배수");
			break;
		default:
			System.out.println(a + "는 3의배수가 아니다.");
		}
		
		sc.close();
		a = sc.nextInt();
	}
}





