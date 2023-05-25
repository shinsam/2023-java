package s0525;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		Account user = new Account("신경화" , 456789, 10000);
		user.printInfo();
		
		Scanner sc = new Scanner(System.in);
		int money;
		while(true) {
			user.printMenu();
			int menu = sc.nextInt();
			if( menu==4) {
				System.out.println("이용해주셔서 감사합니다.");
				break;
			}else if(menu==1) {//입금
				System.out.print("입금할 금액:");
				money = sc.nextInt();
				user.inputMoney(money);
			}else if(menu==2) {//출금
				System.out.print("출금할 금액:");
				money = sc.nextInt();
				user.outputMoney(money);
			}else if(menu==3) {
				user.printInfo();
			}else {
				System.out.println("다시 입력해주세요");
			}
		}
	}
}
