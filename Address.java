package Exam01;

public class Address {

	private String name; // �̸�
	private int age; // ����
	private String phoneNumber; // ��ȭ��ȣ

	public Address(String name, int age, String phoneNumber) {
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void show() {
		
//		System.out.printf("[�̸� :  %s, ���� :  %d, ��ȭ��ȣ :  %s]%n", name, age, phoneNumber);
		System.out.printf(" %s(%d��) : %s %n",name, age, phoneNumber);
	}
	
}
