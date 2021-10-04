package ch01Class0930Thu;

//사람 클래스
/*  main()메소드가 없는 클래스 - 라이브러리용 */
public class Person {
	//속성 (은 하나만)
	Car car = new Car(); //사용관계
	//기능
	void calc() {
		//Calculator의add()메소드에 10과 20을 전달하여 신호전송
		int result = Calculator.add(10,20);
		//전달될 결과 값을 출력
		System.out.println(result);
	}
}


/* 

이들의 관계를 상속 사용 집합 관계 다시 생각해보기

*/