package s0323;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//숫자를 입력 받아서 홀수인지 짝수인지 출력하기

		//입력 
		//a:20
		//b:10
		//연산자:*
		//출력) 20*10 = 200

		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.print("a:");
		a = sc.nextInt();
		
		System.out.print("b:");
		b = sc.nextInt();
		
		System.out.print("연산자:");
		char c = sc.next().charAt(0);
		
		if(c == '+')
			System.out.println(a + "+" + b + "=" + (a+b));
		else if(c == '-')
			System.out.println(a + "-" + b + "=" + (a-b));
		else if(c == '*')
			System.out.println(a + "*" + b + "=" + (a*b));
		else if(c == '/')
			System.out.println(a + "/" + b + "=" + (a/b));
		
		boolean x = true;
		if(x)
			System.out.println(x + "0이 아니다.");
		else
			System.out.println(x + "0이다.");
		
	}

}







