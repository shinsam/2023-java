package s0330;

import java.util.Scanner;

public class Exam11 {
	//N:3
	//* * *
	//* *
	//*
	
	public static void main(String[] args) {
		int N;
		Scanner sc = new Scanner(System.in);
		System.out.print("N:");
		N = sc.nextInt();
		for(int i = N ; i>=1 ; i--)  //i=3 2 1
		{
			for(int j = 1; j<=i ; j++)
		
				System.out.print("*" + "\t");
			System.out.println();
		}
	}

}
