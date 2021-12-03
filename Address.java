package Exam01;

public class Address {

	private String name; // 이름
	private int age; // 나이
	private String phoneNumber; // 전화번호

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
		
//		System.out.printf("[이름 :  %s, 나이 :  %d, 전화번호 :  %s]%n", name, age, phoneNumber);
		System.out.printf(" %s(%d세) : %s %n",name, age, phoneNumber);
	}
	
}
