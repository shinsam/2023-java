package s0615;

public class BookMain2 {

	public static void main(String[] args) {
		Cartoon c1 = new Cartoon();
		c1.title = "순정만화";
		c1.writer = "강풀";
		c1.webtoon = true;
		c1.printBook();
		
		Major m1 = new Major();
		m1.subject = "프로그래밍";
		m1.title = "자바의 정석";
		m1.writer = "남궁성";
		m1.printBook();
	}

}

class Book2 {
	String title;
	String writer;
	void printBook() {
		System.out.println("도서명:" + title + " 작가:" + writer);
	}
}

class Cartoon extends Book2{
	boolean webtoon;

	@Override
	void printBook() {
		// TODO Auto-generated method stub
		super.printBook();
		if(webtoon) {
			System.out.println("이 만화는 웹툰");
		}else {
			System.out.println("웹툰 아님");
		}
	}
}


class Major extends Book2{
	String subject;

	@Override
	void printBook() {
		// TODO Auto-generated method stub
		super.printBook();
		System.out.println("전공분야는 " + subject + "입니다.");
	}
	
}
