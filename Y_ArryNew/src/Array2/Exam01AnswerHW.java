package Array2;

import java.util.Scanner;

public class Exam01AnswerHW {

	public static void main(String[] args) {

		//1. id="hong", pwd="1234"
		//id�� pwe�� scanner�� �Է¹޾Ƽ� id�� pwd�� �� �� ������ "login����",
		//�ƴϸ� "1ȸ �����Ͽ����ϴ�". ���
		//5ȸ �����ϸ�, "5ȸ �����Ͽ����ϴ�. ���α׷��� �����մϴ�." ��� �� ����
	
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		
		
		String id;
		String pwd;
		
		
		
		while (true) {
			
			System.out.println("id�� �Է��ϼ��� : ");
			id = scanner.nextLine();	
			
			System.out.println("pwd�� �Է��ϼ��� : ");
			pwd = scanner.nextLine();
			
			if (id.equals("hong") && pwd.equals("1234")) {
				System.out.println("**** login ���� ****");
				break;
			} else {
				count++;
				System.out.println("**** " + count + "ȸ �����Ͽ����ϴ� ****");
				
				if (count == 5) {
					System.out.println("���α׷��� �����մϴ�.");
					break;
				}
			}
			
		}
		
		
		
		
		
		
		
		
		/*
		if (id == "hong" && pwd == "1234") {
			System.out.println("login ����");			
		} else {  // ���� 
			System.out.println();
		}
		*/
	}
}

//���� Ÿ�� �����ڸ� ����Ҷ��� equals�� ����.
