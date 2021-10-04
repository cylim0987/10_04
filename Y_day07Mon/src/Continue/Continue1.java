package Continue;

public class Continue1 {

	public static void main(String[] args) {

		
		//
		for(int i=1; i<=10; i++) {
			if(i%2!=0) { //홀수면 출력하지 않기, 홀수만 출력
				continue; // for문이면 i++문으로 바로 이동, 아래 print(i)문은 실행하지 않음.
			}
			System.out.println(i);
		}
		
	}

}W
