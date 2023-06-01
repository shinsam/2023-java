package s0601;

public class Car {
	private String name; 	//아반떼 ,...
	protected String color;
	int velocity;
	public String company; 	//회사명
	

	Car(){
		System.out.println("Car기본생성자");
	}
	
	Car(String name){
		System.out.println("Car생성자 2");
	}
	
	
	void speedUp() {
		velocity +=5;
		System.out.println("속도증가: " + velocity);
	}
	
	void speedDown() {
		velocity -=5 ;
		System.out.println("속도감소: " + velocity);
	}
	
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name ; 
	}
	
}









