//9) ������ Ű����κ��� �л� ���� �� �л����� ������ �Է¹޾Ƽ�, �ְ� ���� �� ��� ������ ���ϴ� ���α׷��̴�.
//�������� ����, �˸°� �ۼ��϶� ( Scanner�� nextInt()�޼ҵ�� �ֿܼ� �Էµ� ���ڸ� �а� �����Ѵ�.

import java.util.Scanner;
public class Exercise09 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------------------------------");
			System.out.println("1. �л��� | 2. �����Է� | 3. ��������Ʈ | 4. �м� | 5. ����");
			System.out.println("------------------------------------------------------------");
			System.out.println("����> ");

			int selectNo = scanner.nextInt(); // ��Ʈ :  Scanner�� nextInt()�޼ҵ�� �ֿܼ� �Էµ� ���ڸ� �а� �����Ѵ�.
			
			if(selectNo == 1) {
				System.out.println("�л���>");
				studentNum = scanner.nextInt();
			 
				int[] student = null;
				student = new int[] {};
				
				for(int i=0; i<studentNum; i++) {
					System.out.println("scores" + "[" + i + "]");
				}

				
			}else if(selectNo == 2) {
				//
			}else if(selectNo == 3) {
				//s
			}else if(selectNo == 4) {
				//
			}else if(selectNo == 5) {
				run = false;
			}
		}
		
		System.out.println("���α׷� ����");
	}

}
