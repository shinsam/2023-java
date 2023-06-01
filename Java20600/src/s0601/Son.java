package s0601;

public class Son extends Father {


	
	public Son(String name) {
		super(name);
		System.out.println("Son 생성자");	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son a = new Son("손흥민");
	}

}
