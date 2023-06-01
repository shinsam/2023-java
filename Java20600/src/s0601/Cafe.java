package s0601;

public class Cafe {
	private int coffee;
	private int sugar;
	private int cream;

	public void makeTea() {
		printTeaInfo();
	}
	
	public void makeTea(int coffee) {
		this.coffee = coffee ; 
		makeTea();
		
		
	}

	public void makeTea(int coffee, int sugar) {
		this.sugar = sugar;
		makeTea(coffee);
	}

	public void makeTea(int coffee, int sugar, int cream) {
		this.cream = cream;
		makeTea(coffee, sugar);
	}
	
	void printTeaInfo() {
		System.out.println("----[성분]----");
		System.out.println("커피:" + coffee );
		System.out.println("설탕:" + sugar);
		System.out.println("크림:" + cream);
		System.out.println("커피 농도 : " + (coffee + sugar + cream));
		System.out.println("-------------");
		
		
	}

}




