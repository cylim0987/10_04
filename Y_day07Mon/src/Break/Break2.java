package Break;

public class Break2 {

	public static void main(String[] args) {

		int num=0, sum=0;
		while(true) {
			num++; //1씩 증가
			sum = sum + num; //누적해서 더하기 // sum+=num;
			if(num==50)
				break; // while블럭을 빠져나가는 조건 break;
		}
		System.out.println("합계 :" + sum);
	}

}
