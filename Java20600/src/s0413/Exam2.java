package s0413;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Exam2 {

	public static void main(String[] args) {
		// 1234
		// 1234
		// 1234
		System.out.println("-----1번------");
		for (int i = 1; i <= 3; i++) {// 행
			for (int j = 1; j <= 4; j++)// 열
				System.out.print(j);
			System.out.println();
		}
		// 111
		// 222
		// 333
		// 444
		System.out.println("-----2번------");
		for (int i = 1; i <= 4; i++) {// 행
			for (int j = 1; j <= 3; j++)// 열
				System.out.print(i);
			System.out.println();
		}
		// 1
		// 12
		// 123
		// 1234
		System.out.println("-----3번------");
		for (int i = 1; i <= 4; i++) {// 행
			for (int j = 1; j <= i; j++)// 열
				System.out.print(j);
			System.out.println();
		}

		// ***
		// **
		// *
		System.out.println("-----4번------");
		for (int i = 3; i >= 1; i--) {// 행
			for (int j = i; j >= 1; j--)// 열
				System.out.print("*");
			System.out.println();
		}
//		123
//		12
//		1
		System.out.println("-----5번------");
		for (int i = 3; i >= 1; i--) {// 행
			for (int j = 1; j <= i; j++)// 열
				System.out.print(j);
			System.out.println();
		}
//		111
//		22
//		3

		System.out.println("-----6번------");
		for (int i = 1; i <= 3; i++) {// 행
			for (int j = 3; j >= i; j--)// 열
				System.out.print(i);
			System.out.println();
		}
	}
}
