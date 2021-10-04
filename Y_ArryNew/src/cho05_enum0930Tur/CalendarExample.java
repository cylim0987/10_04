package cho05_enum0930Tur;

//java.util패키지에 있음.
import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 달력 정보 객체 - 시스템의 달력 정보를 객체화 한 것 */

		// 칼렌다 객체 생성 Calendar.getInstance() <- 이렇게 생성함.
		Calendar cal = Calendar.getInstance();

		int year = cal.get(Calendar.YEAR); // 스크린샷 - 칼렌다가 가지고 있는 정보들.get가져옴(?)
		int month = cal.get(Calendar.MONTH);
		int date = cal.get(Calendar.DATE);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		int daysInYear = cal.get(Calendar.DAY_OF_YEAR);
		int weeksInYear = cal.get(Calendar.WEEK_OF_YEAR);
		int weeksInMonth = cal.get(Calendar.WEEK_OF_MONTH);
		
		System.out.println(year + "년");
		System.out.println(month + 1 + "월"); // 9월인데 왜 8월로 나오는가? 그거슨 0부터 시작이기 때문? 왜 월만? 아님. 이렇게 만들어졌음.:: 월(MONTH)값은 0부터 시작.
		System.out.println(date + "일");
		System.out.println(week + "주");
		System.out.println("올해의 " + daysInYear + "일째");
		System.out.println("올해의 " + weeksInYear + "째 주");
		System.out.println("이달의 " + weeksInMonth + "째 주");

		
		// 배열 끝..... 이제 클래스다.
		
	}

}
