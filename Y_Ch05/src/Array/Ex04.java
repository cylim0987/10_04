package Array;

public class Ex04 {

	public static void main(String[] args) {

		int[] score = {78, 98, 54, 76, 87};
		System.out.println("배열의 갯수: " +score.length);
		//총점
		int total = 0;
		for(int i=0; i<score.length; i++) {
			total = total + score[i]; //score[0], score[1], ...
		}
		System.out.println("총점: " + total);
		//평균 double타입 형태 출력.
		double avg= 0;
		avg=total/(double)score.length;
		System.out.println("평균: " + avg);

	
	total = 0;
	//향상된 for문으로 총점구하기
	for(int s:score) {
		total +=s; //score[0],score[1],...
	}
	//평균
	avg=total/(double)score.length;
	System.out.println("평균: " + avg);
	 /* 
			int sum = 0;
			for(int i=0; i<scores.length; i++) {
				sum = sum + scores[i]; //배열에 저장된 요소 접근 - 배열변수명[index번호]
			}
			double avg = sum/(double)scores.length;
			System.out.println("avg: " + avg);
			
	 * 
	 */
	}
}