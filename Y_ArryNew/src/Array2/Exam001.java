package Array2;

import java.util.Scanner;

public class Exam001 {

	public static void main(String[] args) {
		// 1. id="hong", pwd="1234"
				// id�� pwd�� scanner�� �Է¹޾Ƽ� id�� pwd�� �Ѵ� ������ "login����",
				// �ƴϸ� "1ȸ �����Ͽ����ϴ�". ���
				// 5ȸ �����ϸ�, "5ȸ �����Ͽ����ϴ�. ���α׷��� ���� �մϴ�" ��� �� ����
		Scanner scanner = new Scanner(System.in);

		int count;
		count = 0;

		while (true) {
			System.out.println("id�� �Է��ϼ���");
			String id;
			id = scanner.nextLine(); //�׳� next�� �ص� �ȴ�!

			System.out.println("pwd�� �Է��ϼ���");
			String pwd;
			pwd = scanner.nextLine(); //�׳� next�� �ص� �ȴ�. ���ַ��� ���� id�� ���ƾߵ�.

			if (id.equals("hong") && pwd.equals("1234")) {
				System.out.println("login����");
				break;
			} else {
				count++;
				System.out.println(count + "ȸ �����Ͽ����ϴ�.");
				if (count == 5) {

					break;
				}

			}
		}

		System.out.println("���α׷��� �����մϴ�.");
	}
}
