package Exam01;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressMain {
	// arraylist 연계 실습.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Address> addressList = new ArrayList<Address>();

		while (true) {
			System.out.print("[1] 추가 [2] 전체조회 [3] 삭제 [4] 검색 [5] 종료 >> ");
			int input = sc.nextInt();

			if (input == 1) {
				// 전화번호부(addressList)에 값 추가.
				// 이름, 나이, 전화번호를 입력 받아서 객체로 만들어서 addressList에 추가.
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("나이 : ");
				int age = sc.nextInt();
				System.out.print("전화번호 : ");
				String number = sc.next();
				Address address = new Address(name, age, number);
				addressList.add(address);

			} else if (input == 2) {
				if (addressList.size() == 0) {
					System.out.println("등록된 연락처가 없습니다.");
				} else {
					extracted(addressList);
				}

			} else if (input == 3) {
				if (addressList.size() == 0) {
					System.out.println("삭제할 연락처가 없습니다.");
				} else {
					extracted(addressList);
					System.out.print("삭제할 목록 번호 입력 : ");
					int deleteNumber = sc.nextInt() - 1;
					addressList.remove(deleteNumber);
					extracted(addressList);
				}
			} else if (input == 4) {
				System.out.print("검색할 이름을 입력해주세요 : ");
				String inputName = sc.next();
				int check = addressList.size();
				for (int i = 0; i < addressList.size(); i++) {
					if (inputName.equals(addressList.get(i).getName())) {
						addressList.get(i).show();
						check--;
					}
				}
				if (check == addressList.size()) {
					System.out.println("검색결과가 없습니다.");
				}

			} else if (input == 5) {
				System.out.println("프로그램 종료");
				break;
			}

		}

	}

	private static void extracted(ArrayList<Address> addressList) {
		System.out.println("=====목록=====");
		for (int i = 0; i < addressList.size(); i++) {
			System.out.print(i + 1 + ".");
			addressList.get(i).show();
		}
	}

}
