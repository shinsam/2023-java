package s0525;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.name="이도령";
		e1.no  = 12345 ; 
		e1.age = 18;
		e1.print();
		
		Employee e2 = new Employee();
		e2.setAge(17);
		e2.setName("김로봇");
		e2.setNo(78945);
		e2.print();
		
	}

}
