package If;

import java.util.Scanner;

public class If5 {

	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	System.out.println("���ڸ� �Է��ϼ���");
	int num = scanner.nextInt();
	String str = "";
	if(num < 10) str = "10�̸�";
	else if(num<100) str = "10�̻� 100�̸�";
	else if(num<1000) str = "100�̻� 1000�̸�";
		if(num >=500) str = "500�̻� 1000�̸�";
		else str = "100�̻� 1000�̸�";
	
	System.out.println(str + "�� ���Դϴ�.");
	
	}

}
