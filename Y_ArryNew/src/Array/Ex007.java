package Array;

public class Ex007 {

	public static void main(String[] args) {

		//향상된 for문으로 수정해서 최대값, 최소값, 평균을 구하시오
		int[] score = {76, 45, 34, 89, 100, 50, 90, 92};
		int sum=0, max=0, min=100;
		
		for(int e:score) {
			sum+=e;
			if(max < e ) max = e;//max값보다 score값이 크면 교환	
		{	
		System.out.println("최대값: " + max);
			
		for(int j:score)
			if(min >j ) min=j; //min값보다 score값이 작으면 교환
		}
			System.out.println("최소값: " +min);
			System.out.println("합계: " +sum);
			System.out.println("평균: " +sum/(double)score.length);
		}
	}
}		
