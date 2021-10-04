package Array;

public class ArrayEx01 {

	public static void main(String[] args) {
		//정수타입 개의 변수에 저장된 값의 평균 구하기
		int s1 = 10;
		int s2 = 14;
		int s3 = 5;
		int s4 = 7;
//무작위라 for문 불가
		int sum = 0;
		int cnt = 0;
		sum = sum + s1;
		cnt++;
		sum+=s2;
		cnt++;
		sum+=s3;
		cnt++;
		sum+=s4;
		cnt++;
		
		double avg = sum/(double)cnt;
		System.out.println("avg: "+ avg);
	}

}
