package s0601;

public class EngHello extends Greeting{

	public String name = "Mr.Hong";
	void sayHello() {
		System.out.println(name + " Nice to meet you!");
	}
	void 안녕하세요() {
		super.sayHello();
	}
	
	
	public static void main(String[] args) {
		EngHello eng = new EngHello();
		eng.sayHello();
		eng.안녕하세요();

	}

}
