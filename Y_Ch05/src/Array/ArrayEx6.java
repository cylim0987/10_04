package Array;

public class ArrayEx6 {

	public static void main(String[] args) {
		//정수타입 4개의 변수에 저장된 값의 평균 구하기
		int s1 = 10;
		int s2 = 14;
		int s3 = 5;
		int s4 = 7;
	
		//배열선언
		//타입(변수명 [] = {초기값1, 초기값2, 초기값3, 초기값4, ... };
		
		int scores [] = null;
		//배열 참조 변수 선언 후 나중에 초기값으로 배열생성시키는 new 타입(int) [] 을 {}앞에 붙여줘야함.		
		scores = new int[] {10, 14, 5, 7};
		System.out.println(scores.length);
				
		int sum = 0;
		
		for(int i=0; i<scores.length; i++) {
				sum = sum + scores[i]; //배열에 저장된 요소 접근 - 배열변수명[index번호]
			}
			double avg = sum/(double)scores.length;
			System.out.println("avg: " + avg);
			
			System.out.printf("%.3f", avg);
			
	/**		
		
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
		System.out.println("평균: "+ avg);
**/
	
	
	}

}
