package s0316;

public class Exam02 {

	public static void main(String[] args) {
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		if(str1==str2) // 주소가 같니?
			System.out.println("같은주소");
		else
			System.out.println("다른주소");
		
		String str3 = "abc";
		String str4 = "abc";
		if(str3==str4) // 주소가 같니?
			System.out.println("같은주소");
		else
			System.out.println("다른주소");
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
			
		str3 = "qqq";
		System.out.println(str4);
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
	}

}
