package cho05_enum0930Tur;

import java.util.Scanner;

/* ���� Ÿ�� �޼ҵ��*/
public class EnumMethodExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // -valueOf.

		// name()�޼ҵ�
		Week today = Week.SUNDAY;
		String name = today.name(); // ����Ÿ�Ի�� -> StringŸ������ ��ȯ
		System.out.println(name); // 0, 1, 2, 3, 4, 5, 6

		// ordinal() �޼ҵ�
		int ordinal = today.ordinal();
		System.out.println(ordinal); // 0, 1, 2, 3, 4, 5, 6

		// compareTo() �޼ҵ�
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2); // �ܼ�: -2 . day1���忡�� day2���� -2. ...... 0 - 2
		int result2 = day2.compareTo(day1); // �ܼ�: +2 . day2���忡�� day1���� +2. ...... 2 - 0
		System.out.println(result1);
		System.out.println(result2);

		// valueOf() �޼ҵ� : String -> ���Ŵ�
		System.out.println("������ ���Ż�� �������� �Է����ּ���.");
		String strday = scanner.next(); // �ԷµǸ�.
		Week weekDay = Week.valueOf(strday); //��ĳ�ʷ� �Է¹��� ���ڿ��� ->Week����� ��ȯ
		
		switch (weekDay.ordinal()) {// switch�� ����. ������ �÷��� ���� ������ �־?
		case 0: // 0���� ����
		case 1:
		case 2:////////ordinal()�� �̿��ϸ� switch �������� enum �̿��ؼ� �������� �� �� �ְڴ�.(ä��â)
		case 3:
		case 4:
		case 5:
			System.out.println("�����Դϴ�.");
			break;
		case 6:
			System.out.println("�ָ��̱���.");
			break;
		}
		if (weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) { // ����� Ȥ�� �Ͽ����� �ԷµǸ�.
			System.out.println("�ָ��̱���.");
		} else {
			System.out.println("�����Դϴ�.");
		}
//			System.out.println(strday); - Ʋ����?. ���� Ʋ����  
/*
		// values() �޼ҵ�
		Week[] days = Week.values();
		for (int i = 0; i < days.length; i++)
			System.out.print(days[i] + " ");
		System.out.println();

		for (Week d : days)
			System.out.print(d + " ");
*/
	}

}
