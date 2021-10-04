package Array;

public class ArrayEx2 {

	public static void main(String[] args) {
		//정수타입 4개의 변수에 저장된 값의 평균 구하기
		int s1 = 10;
		int s2 = 14;
		int s3 = 5;
		int s4 = 7;
	
		//배열선언
		//타입(int) [] 변수명 = new 타입(int) [저장할요구갯수];
			int[] scores = new int[4];
			//동일타입의 값이 순서대로 연속해서 저장됨.
			//배열의 index시작은 0부터.
			scores[0] = 10;
			scores[1] = 14;
			scores[2] = 5;
			scores[3] = 7; //배열의 마지막은 (저장요소의 갯수 - 1) 번이 index번호.
			
			int sum = 0;
			for(int i=0; i<4; i++) {
				sum = sum + scores[i]; //배열에 저장된 요소 접근 - 배열변수명[index번호]
			}
			double avg = sum/(double)4;
			System.out.println("avg: " + avg);
			
			
			
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
