package Exam01;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressMain {
	// arraylist ���� �ǽ�.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Address> addressList = new ArrayList<Address>();

		while (true) {
			System.out.print("[1] �߰� [2] ��ü��ȸ [3] ���� [4] �˻� [5] ���� >> ");
			int input = sc.nextInt();

			if (input == 1) {
				// ��ȭ��ȣ��(addressList)�� �� �߰�.
				// �̸�, ����, ��ȭ��ȣ�� �Է� �޾Ƽ� ��ü�� ���� addressList�� �߰�.
				System.out.print("�̸� : ");
				String name = sc.next();
				System.out.print("���� : ");
				int age = sc.nextInt();
				System.out.print("��ȭ��ȣ : ");
				String number = sc.next();
				Address address = new Address(name, age, number);
				addressList.add(address);

			} else if (input == 2) {
				if (addressList.size() == 0) {
					System.out.println("��ϵ� ����ó�� �����ϴ�.");
				} else {
					extracted(addressList);
				}

			} else if (input == 3) {
				if (addressList.size() == 0) {
					System.out.println("������ ����ó�� �����ϴ�.");
				} else {
					extracted(addressList);
					System.out.print("������ ��� ��ȣ �Է� : ");
					int deleteNumber = sc.nextInt() - 1;
					addressList.remove(deleteNumber);
					extracted(addressList);
				}
			} else if (input == 4) {
				System.out.print("�˻��� �̸��� �Է����ּ��� : ");
				String inputName = sc.next();
				int check = addressList.size();
				for (int i = 0; i < addressList.size(); i++) {
					if (inputName.equals(addressList.get(i).getName())) {
						addressList.get(i).show();
						check--;
					}
				}
				if (check == addressList.size()) {
					System.out.println("�˻������ �����ϴ�.");
				}

			} else if (input == 5) {
				System.out.println("���α׷� ����");
				break;
			}

		}

	}

	private static void extracted(ArrayList<Address> addressList) {
		System.out.println("=====���=====");
		for (int i = 0; i < addressList.size(); i++) {
			System.out.print(i + 1 + ".");
			addressList.get(i).show();
		}
	}

}
