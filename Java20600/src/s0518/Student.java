package s0518;

public class Student {
	//멤버 변수
	private String name;
	private int grade;
	static int count;
	
	
	//생성자
	Student(){
		count++;
	}
	
	//메소드
	static int getCount(){
		return count;
	}
	
	
	String getName() {
		return name;
	}
	void setName( String name ) {
		this.name = name ; 
	}
	
	int getGrade() {
		return grade;
	}
	void setGrade(int grade) {
		this.grade = grade ;
	}
	
	void print() {
		
	}
}




