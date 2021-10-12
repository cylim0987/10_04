package ch06_methods;

public class MethodMainExam {

	public static void main(String[] args) {

		//메소드를 내장하고있는 클래스의 객체 생성
	MethodExam m = new MethodExam(); // 빼오기 위한 새로운 생성.
	
	//참조변수의 메소드 접근
	//1.유형(매개변수O, 리턴타입O)
	//메소드메인이그잼이라는 클래스에서 사용할 [바로아래] 함수를 호출하지 않고 직접
	//계산했을 때. 어떤 타입이느냐에 따라 선언되는 함수가 달라진다.
	//만약 아래가 더블이라면 메소드이그잼에 인트를 더블로 만들어줘야한다.
	// 첫 번째, 두번째 정수를 받아서 연산 후 결과를
	// int타입으로 되돌려줌.	
	int result = m.sum(10, 10);
	System.out.println(result);
	

	//2.유형(매개변수X, 리턴타입O)
	String str1 = m.greeting();
	System.out.println(str1);
	
	//3.유형(매개변수O, 리턴타입X)
	m.sumVoid(10, 30);
	
	//4.유형(매개변수X, 리턴타입X)
	m.greetingVoid();
	
	}

}

