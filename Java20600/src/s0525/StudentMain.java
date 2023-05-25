package s0525;

public class StudentMain {
	public static void main(String[] args) {
		Student kim = new Student();
		kim.name = "김로봇";
		kim.grade = 1;
		
		Student lee = new Student("이로봇");
		lee.grade = 2;
		
		Student park = new Student("박로봇" ,3);
		
		kim.print();
		lee.print();
		park.print();
		
	}
}
