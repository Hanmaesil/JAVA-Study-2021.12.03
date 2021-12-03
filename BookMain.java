package Exam01;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {

//		BookData book1 = new BookData("자바", 10000, "병관"); //생성자를 통해 book1이라는 변수를 만들때 매개변수를 입력하여 데이터를 만든다.
//		BookData book2 = new BookData("DataBase", 20000, "동원");
//		BookData book3 = new BookData("Web", 30000, "승환");

		Scanner sc = new Scanner(System.in);

		// private로 감추어 놨기 때문에 오류 발
//		book1.Title = "";
		// 하지만 메소드를 통해서 간접적으로 접근할 수 있다.
//		System.out.println("책제목 : " + book1.getTitle());

		// 배열에 넣기. 데이터타입은 BookData 이다.
		BookData[] bookList = new BookData[3];
		for (int i = 0; i < bookList.length; i++) { // 반복문을 통해 매개변수 입력받기.
			System.out.print("책 제목을 입력해주세요 : ");
			String title = sc.next();
			System.out.print("가격을 입력해주세요 : ");
			int price = sc.nextInt();
			System.out.print("저자를 입력해주세요 : ");
			String writer = sc.next();
			BookData book = new BookData(title, price, writer);
			bookList[i] = book;
		}
		
		
		System.out.println("================");
		System.out.print("금액을 입력하세요 : ");
		int inputMoney = sc.nextInt();
		System.out.println("구매가능한 목록");
		
		
		int a = bookList.length;
		for(int i = 0; i < bookList.length; i++) {
			if(bookList[i].getPrice() <= inputMoney) {
				bookList[i].view();
				a--;
			}
		}if( a == bookList.length) {
			System.out.println("<구매 가능한 책이 없습니다.>");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

//		bookList[0] = book1; //배열에 집어넣기.
//		bookList[1] = book2;
//		bookList[2] = book3;

		// bookList 사용해서 책 이름을 전부 출력하세요.
//		for (int i = 0; i < bookList.length; i++) {
//			System.out.println("책제목 : " + bookList[i].getTitle());
//		}

	}

}
