package s0525;

public class Account {
	String name;
	int no, balance; //계좌번호, 잔고
	
	Account(){
		System.out.println("=====계정 추가=====");
	}
	Account(String name, int no){
		this();
		this.name = name;
		this.no = no;
	}
	Account(String name, int no, int balance){
		this(name, no);
		this.balance = balance;
	}
	
	//메소드
	void printInfo() {
		System.out.println("[계좌정보] \n예금주:" + name + "\n계좌번호:" + no + "\n잔고:" + balance);
	}
	
	//inputMoney
	void inputMoney(int money) {
		balance += money;
		printInfo();
	}
	
	//outputMoney
	void outputMoney(int money) {
		if(balance < money) {
			System.out.println("잔고가 부족합니다.");
		}else {
			balance -= money;
		}
		printInfo();
		
	}
	
	
	void printMenu() {
		System.out.println("\n작업을 선택하세요\n"
				+ "1. 입금\n"
				+ "2. 출금\n"
				+ "3. 잔고조회\n"
				+ "4. 종료");
	}
}





