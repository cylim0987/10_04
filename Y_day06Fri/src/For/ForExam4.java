package For;

import java.util.Scanner;

public class ForExam4 {
	public static void main(String[] args) {
//������
	Scanner scanner = new Scanner(System.in);
	System.out.println("���� ���� ��������?");
	int num = scanner.nextInt();
	System.out.println("������ " + num + "��");
	for (int i = 1; i <= 99999; i++) {
		System.out.println(num + " * " + i + "=" + num * i);
	}
		
	}
}
	
