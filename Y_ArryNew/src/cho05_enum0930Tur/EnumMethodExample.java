package cho05_enum0930Tur;

import java.util.Scanner;

/* 열거 타입 메소드들*/
public class EnumMethodExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // -valueOf.

		// name()메소드
		Week today = Week.SUNDAY;
		String name = today.name(); // 열거타입상수 -> String타입으로 변환
		System.out.println(name); // 0, 1, 2, 3, 4, 5, 6

		// ordinal() 메소드
		int ordinal = today.ordinal();
		System.out.println(ordinal); // 0, 1, 2, 3, 4, 5, 6

		// compareTo() 메소드
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2); // 콘솔: -2 . day1입장에서 day2보다 -2. ...... 0 - 2
		int result2 = day2.compareTo(day1); // 콘솔: +2 . day2입장에서 day1보다 +2. ...... 2 - 0
		System.out.println(result1);
		System.out.println(result2);

		// valueOf() 메소드 : String -> 열거다
		System.out.println("요일을 열거상수 형식으로 입력해주세요.");
		String strday = scanner.next(); // 입력되면.
		Week weekDay = Week.valueOf(strday); //스캐너로 입력받은 문자열을 ->Week상수로 변환
		
		switch (weekDay.ordinal()) {// switch가 낫다. 정수가 플러스 값이 정해져 있어서?
		case 0: // 0부터 시작
		case 1:
		case 2:////////ordinal()을 이용하면 switch 문에서도 enum 이용해서 조건으로 쓸 수 있겠다.(채팅창)
		case 3:
		case 4:
		case 5:
			System.out.println("평일입니다.");
			break;
		case 6:
			System.out.println("주말이군요.");
			break;
		}
		if (weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) { // 토요일 혹은 일요일이 입력되면.
			System.out.println("주말이군요.");
		} else {
			System.out.println("평일입니다.");
		}
//			System.out.println(strday); - 틀렷음?. ㅇㅇ 틀렸음  
/*
		// values() 메소드
		Week[] days = Week.values();
		for (int i = 0; i < days.length; i++)
			System.out.print(days[i] + " ");
		System.out.println();

		for (Week d : days)
			System.out.print(d + " ");
*/
	}

}
