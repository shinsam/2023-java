package s0608;

public class Car {
	String name="차";
	String color;
	int velocity;

	void speedUp() { //jj
		velocity += 5;
		System.out.println("속도 " + velocity + " 증가");
	}

	void speedDown() {
		velocity -= 5;
		System.out.println("속도 " + velocity + " 감소");
		//test
	}
	String print() {
		 return "[나는 " + name + "이다.]" ;
	}
}