package Array2;

import java.util.Scanner;

public class Exam01AnswerCY {
	
	public static void main(String[] args) {
		
		/*
		 *  �Է¹޾�: id, pwd
		 *  üũ ���
		 *  
		 *  ���1 : ���� -> ����Ʈ:���� -> ����
		 *  ���2: ���� -> ����Ʈ: ���� -> ó������ 
		 *  
		 *  - > �ٽ� �Է¹޾ƾƾ� �� -> count. ���и� 5�� �ϸ� ����. 
		 */
		
		
	
		//String id;
		//id = "hong";
		
		//String pwd;
		//pwd = "1234";
		
		
		//1. �Է¹޾�.  scanner    Ȯ�ο��../ ????
		Scanner scanner = new Scanner(System.in);
		
		int count;
		count = 0;
		
		while (true) {
			
			//1. �Է¹޾�.  scanner
			//Scanner scanner = new Scanner(System.in);
			//����? �̰� �ݺ� �� �ص� �ǳ�?
			
			// 2. �Է¹��� �� �����Ѵ�.
			System.out.println("id�� �Է��ϼ���");
			String id;
			id = scanner.nextLine();
			//System.out.println("id: " + id);
			
			System.out.println("pwd�� �Է��ϼ���");
			String pwd;
			pwd = scanner.nextLine();
			//System.out.println("pwd: " + pwd);
			
			
			if (id.equals("hong") && pwd.equals("1234")) {
				System.out.println("**** login���� ****");
				break;
			} else {
				
				count++;
				System.out.println("**** " + count + "ȸ �����Ͽ����ϴ� ****");
				//System.out.println(count + "ȸ �����Ͽ����ϴ�");
				
				
				// 5�� �� �� break;
				// ���� count == 5
				// -> break;
				if (count == 5) {
					
					break;
				}
				

				/*
				for (count = 0; count <= 5; count++) {
					System.out.println(count + "ȸ �����Ͽ����ϴ�");
				}
				*/
			}
		} 
		
		System.out.println("���α׷��� �����մϴ�.");
		
	
		/*
		if ((id == "hong") && (pwd == "1234")) {
			System.out.println("login����");
		} else {
			System.out.println("�����Ͽ����ϴ�");
		}
		*/
	}
}