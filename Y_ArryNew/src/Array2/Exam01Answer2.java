package Array2;

import java.util.Scanner;

public class Exam01Answer2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. id="hong", pwd="1234"
		// id�� pwd�� scanner�� �Է¹޾Ƽ� id�� pwd�� �Ѵ� ������ "login����",
		// �ƴϸ� "1ȸ �����Ͽ����ϴ�". ���
		// 5ȸ �����ϸ�, "5ȸ �����Ͽ����ϴ�. ���α׷��� ���� �մϴ�" ��� �� ����
	//1ȸ ���п� 5ȸ���д� ���������� �ٸ���?
		
		Scanner scanner = new Scanner(System.in);
		int cnt = 0;
		// ī���� �����ϴ� �κ� ����, ���̵��н�������ϴ� �κ��� ���� ��°� �� ����������.
		// while �ȿ� String id, pwd�� ��Ҵ�.
		while (true) {
			String id, pwd; // ����Ÿ�� ����
			if (cnt == 5) {// �⺻����Ÿ Ÿ���� �� ��
				System.out.println(cnt + "ȸ �����Ͽ����ϴ�. ���α׷��� ���� �մϴ�");
				break;
			}
			System.out.println("���̵�� �н����带 �Է��ϼ���.");
			System.out.println("���̵�>");
			id = scanner.next(); // StringŸ������ ����
			System.out.println("�н�����>");
			pwd = scanner.next();// StringŸ������ ����
			if ("hong".equals(id) && "1234".equals(pwd))// ������ü�� �� �� ��������
			{
				System.out.println("�α��� ����");
				break;
			}
			// ���н�
			cnt++;
			if(cnt!=5)
			System.out.println(cnt + "ȸ �����Ͽ����ϴ�.");
		}
		System.out.println("���α׷� ����");
	}
}