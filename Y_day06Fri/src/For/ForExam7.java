package For;

public class ForExam7 {

	public static void main(String[] args) {
//초기화 부분이나 증감부분에 ,로 명령문을 나열할 수 있음.
	//for(초기화;for블럭을 빠져나가는 조건;증감) {실행문;}
	for(int i=1, y=1; i<10; i++ , System.out.println(y) ) {//for 블럭을 빠져나가는 조건이 없는 경우, 조건을 true로 간주.
		System.out.println("hello");
		//for블럭을 빠져나가는 조건을 블럭내에서 처리{}
		if (i==10)
			break; //블럭을 빠져나가는 명령문 break;
		y++;
	}
		System.out.println("종료");

	}
}
	
