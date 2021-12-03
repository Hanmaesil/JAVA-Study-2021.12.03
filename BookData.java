package Exam01;

public class BookData {

	// ���������� ���� 215��
	// private : ���� Ŭ���� �������� ������ ����
	// default : ���� ��Ű�� ������ ������ ����
	// protected : ���� ��Ű�� + ��Ӱ����� �ڽ�Ŭ���� ������ ����
	// public : ��Ű���� �����ϰ� ��� Ŭ�������� ������ ����
	
	//static : ���α׷� ���۽� ���� ���۵Ǿ��! ��� ��ɾ�, Ȱ��ȭ ���

	private String title; // å�̸�
	private int price; // å����
	private String writer; // å ����

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


