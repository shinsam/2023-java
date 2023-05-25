package s0525;

public class Employee {
	//member field
	String name;
	int no, age;
	
	//생성자 constructor
	Employee(){
		
	}
	
	Employee(String name, int no, int age){
		this.name = name;
		this.no = no;
		this.age = age;
	}
	
	//get
	String getName() { return name; }
	int getNo() {return no; }
	int getAge() {return age;}
	
	//set
	void setName(String name) {this.name = name;}
	void setNo(int no) {this.no = no;}
	void setAge(int age) {this.age = age;}

	@Override
	public String toString() {
		return "[이름]" + name +" [번호]" + no + "[나이]" + age;
	}
	
	void print() {
		System.out.println("직원정보:" + toString());
	}
	
	
}







