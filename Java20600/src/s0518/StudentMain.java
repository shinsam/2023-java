package s0518;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student kim = new Student();
		kim.setName("김로봇");
		System.out.println("이름:" + kim.getName());
		System.out.println("학생수:" + Student.getCount());
		
		Student song = new Student();
		song.setName("송로봇");
		System.out.println("이름:" + song.getName());
		System.out.println("학생수:" + Student.getCount());
		
		
	}

}
