package Exam01;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {

//		BookData book1 = new BookData("�ڹ�", 10000, "����"); //�����ڸ� ���� book1�̶�� ������ ���鶧 �Ű������� �Է��Ͽ� �����͸� �����.
//		BookData book2 = new BookData("DataBase", 20000, "����");
//		BookData book3 = new BookData("Web", 30000, "��ȯ");

		Scanner sc = new Scanner(System.in);

		// private�� ���߾� ���� ������ ���� ��
//		book1.Title = "";
		// ������ �޼ҵ带 ���ؼ� ���������� ������ �� �ִ�.
//		System.out.println("å���� : " + book1.getTitle());

		// �迭�� �ֱ�. ������Ÿ���� BookData �̴�.
		BookData[] bookList = new BookData[3];
		for (int i = 0; i < bookList.length; i++) { // �ݺ����� ���� �Ű����� �Է¹ޱ�.
			System.out.print("å ������ �Է����ּ��� : ");
			String title = sc.next();
			System.out.print("������ �Է����ּ��� : ");
			int price = sc.nextInt();
			System.out.print("���ڸ� �Է����ּ��� : ");
			String writer = sc.next();
			BookData book = new BookData(title, price, writer);
			bookList[i] = book;
		}
		
		
		System.out.println("================");
		System.out.print("�ݾ��� �Է��ϼ��� : ");
		int inputMoney = sc.nextInt();
		System.out.println("���Ű����� ���");
		
		
		int a = bookList.length;
		for(int i = 0; i < bookList.length; i++) {
			if(bookList[i].getPrice() <= inputMoney) {
				bookList[i].view();
				a--;
			}
		}if( a == bookList.length) {
			System.out.println("<���� ������ å�� �����ϴ�.>");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

//		bookList[0] = book1; //�迭�� ����ֱ�.
//		bookList[1] = book2;
//		bookList[2] = book3;

		// bookList ����ؼ� å �̸��� ���� ����ϼ���.
//		for (int i = 0; i < bookList.length; i++) {
//			System.out.println("å���� : " + bookList[i].getTitle());
//		}

	}

}
