package Switch;
/*  주사위(dice) 1~6 눈을 가진 주사위*/
public class SwitchDiceExample {
	public static void main(String[] args) {

		int num;
		
		num = (int)(Math.random()*6)+1; // 1,2,3,4,5,6 하나로부터 아래까지 나옴
		System.out.println(num);
		//자동으로 실행될때마다 랜덤하게 값을 받고 싶다.면
		
		switch(num) { //변수
		case 1: System.out.println("1번이 나왔습니다.");
			break; //switch문을 빠져나가는 명령문.
		case 2:	System.out.println("2번이 나왔습니다.");
		break;
		case 3:	System.out.println("3번이 나왔습니다.");
		break;
		case 4:	System.out.println("4번이 나왔습니다.");
		break;
		case 5:	System.out.println("5번이 나왔습니다.");
		break;
		default:System.out.println("6번이 나왔습니다.");
		}
		
		
		
	}

}
