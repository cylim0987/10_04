package cho05_enum0930Tur;

import java.util.Calendar;

public class EnumWeekExample {
// ??????? 기울여진 글씨체는 가져온건가? // week상수가 패키지 밖에 있어도 되나? 
	public static void main(String[] args) {
		// 열거타입 변수 선언
		Week today = null;
		// 달력정보(칼렌다)타입의 변수 선언, 칼렌다타입 객체 생성 대입(클래스명.getInstance())대입
		Calendar cal = Calendar.getInstance();// 칼렌다객체 생성한 것.
		int week = cal.get(Calendar.DAY_OF_WEEK);// get(현재의 요일값:Calendar.DAY_OF_WEEK);
		System.out.println(week); // 5가뜨는데. FRI다. 그러면 가져온게 아니지 않음????

		// calendar로부터 읽은 요일 숫자값에 따라 요일출력
		switch (week) {// switch가 낫다. 정수가 플러스 값이 정해져 있어서?
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}
		System.out.println("오늘은: " + today); // String + 열거상수 => String

		// 열거상수 비교
		if (today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 한다");
		} else {
			System.out.println("열심히 자바공부를 한다");
		}

	}

}
