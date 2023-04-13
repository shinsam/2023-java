package s0406;

public class StudentExam {

	public static void main(String[] args) {
		
		Student kim = new Student();
		Student lee;
		lee = new Student();
		
		kim.name = "신경화";
		kim.number = 10100;
		kim.phone = "010-1111-2222";
		kim.School = "우주최강고";
		
		System.out.println("이름:"+kim.name);
		System.out.println("학번:"+kim.number);
		System.out.println("전화:"+kim.phone);
		System.out.println("학교:" +kim.School);
		
		lee.name = "이순신";
		lee.number = 12345;
		lee.phone = "010-9999-8888";
		
		System.out.println("이름:"+lee.name);
		System.out.println("학번:"+lee.number);
		System.out.println("전화:"+lee.phone);
		System.out.println("학교:" +lee.School);
		System.out.println("총학생수:" + Student.count);
		
		
		
		
		
		
	}

}
