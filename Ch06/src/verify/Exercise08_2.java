package verify;
// 8) 주어진 배열의 전체 항목의 합과 평균값을 구하라(중첩 for문 이용)

public class Exercise08_2 {
// int num을 생각 못했다. for 안에서 수가 누적되어야 하는데...
// array.length는 1차원 배열의 항목수다. 0인덱스는 2개, 1인덱스는 3개, 2인덱스는 5개.
	public static void main(String[] args) {
	
				int[][] array = { //2차원 배열인데 1차원 배열의 항목수가 3개, 0인덱스는 2개 1인덱스는 3개 2인덱스는 5개. 
						{ 95, 86 },						// 0 1
						{ 83, 92, 96 },					// 0 1 2
						{ 78, 83, 93, 87, 88 } };		// 0 1 2 3 4
				
				int sum = 0;
				double avg = 0.0;
				
				//count 변수 선언. 배열의 항목 수를 하나씩 누적을 할 것임. 그래서 나중에 sum에서 count를 나눌거다
				int num = 0; // 
				for(int i=0; i<array.length; i++) { //array.length는 3. 
					for(int j=0; j<array[i].length; j++) { // j.. 2번 3번 5번 돌아야하니까. array의 i인덱스배열.에 length만큼 돌아라.
				//		System.out.println(array[i][j]);
					
						sum = sum + array[i][j]; //array i인덱스 값의 j인덱스 값
				
						num++;
						System.out.println(array[i].length);
						
					}
				}
				avg = (double)sum/num;
				System.out.println("총합 : " + sum);
				System.out.println("평균 : " + avg);
				System.out.println(array.length);
				
				System.out.println();
				System.out.println(array[0].length);
				System.out.println(array[1].length);
				System.out.println(array[2].length);
				System.out.println();
				System.out.println(array[0][0]);
				System.out.println(array[0][1]);
				System.out.println(array[1][0]);
				System.out.println(array[1][1]);
				System.out.println(array[1][2]);
				System.out.println(array[2][0]);
				System.out.println(array[2][1]);
				System.out.println(array[2][2]);
				System.out.println(array[2][3]);
				System.out.println(array[2][4]);
				
	}
	}