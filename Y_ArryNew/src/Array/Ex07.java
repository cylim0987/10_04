package Array;

public class Ex07 {

	public static void main(String[] args) {

		//향상된 for문으로 수정해서 최대값, 최소값, 평균을 구하시오
		int[] score = {76, 45, 34, 89, 100, 50, 90, 92};
		System.out.println("배열의 갯수" + score.length);
		
		
		for(int k:score) {
			System.out.println();
		}
			
/*
		int[] n = {12,20,67,567,21};
		System.out.println("배열의 갯수: " +n.length);
		
		for(int i=0; i<n.length; i++)
			System.out.println("["+i+"]=" +n[i]);
	
		System.out.println("향상된 for문");
		//향상된 for문
		for(int k:n) {
			System.out.println(k);	
	*/	
			
			
			
			
			
	}
}
		
	/*	
	//max변수에 배열의 값들보다 현저하게 작은값 저장하여 선언
	//min변수에 배열의 값들보다 현저하기 큰 값 저장하여 선언
		int sum=0, max=0, min=100;
		for(int i=0; i<score.length; i++) {
			sum+=score[i];
			if(max < score[i]) max=score[i];//
		}
		System.out.println("최대값: " + max);	

		for(int i=0; i<score.length; i++) {
			if(min >score[i]) min=score[i];
		}
		System.out.println("최소값: " + min);

		System.out.println("합계: " + sum);
		System.out.println("평균: " + sum/(double)score.length);
	
	}

}
		*/