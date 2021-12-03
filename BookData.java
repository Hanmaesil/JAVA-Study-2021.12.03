package Exam01;

public class BookData {

	// 접근지정자 교재 215쪽
	// private : 같은 클래스 내에서만 접근이 가능
	// default : 같은 패키지 내에서 접근이 가능
	// protected : 같은 패키지 + 상속관계인 자식클래스 접근이 가능
	// public : 패키지를 막론하고 모든 클래스에서 접근이 가능
	
	//static : 프로그램 시작시 같이 시작되어라! 라는 명령어, 활성화 명령

	private String title; // 책이름
	private int price; // 책가격
	private String writer; // 책 저자

	public BookData(String title, int price, String writer) {
		this.title = title;
		this.price = price;
		this.writer = writer;
	}

	public String getTitle() {

		return title;

	}

	public int getPrice() {

		return price;
	}

	public String getWriter() {

		return writer;
	}

	public void view() {
		System.out.printf("[ %s, %s, %d ]%n", this.title, this.writer, this.price);
	}
	
	
}


