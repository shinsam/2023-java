package s0309;

import java.lang.*;
import java.util.Scanner;


public class InOut {

	public static void main(String[] args) {
		System.out.println("Hello" + "Java!");
		System.out.println("제나이는" + 17 + "살");
		System.out.println("3과4를결합" + 3 + 4);
		System.out.println("3과4를결합" + (3 + 4));
		System.out.println(("3과4를결합" + 3) + 4);
		System.out.println("나는 \"안녕\"이라고 말했다.");
		
		Scanner s = new Scanner(System.in);
		System.out.println("나이를 입력:");
		int age = s.nextInt();
		System.out.println("나이:" + age);
	}

}
