package verify;
// 8) 주어진 배열의 전체 항목의 합과 평균값을 구하라(중첩 for문 이용)

public class Exercise08_3 {
	public static void main(String[] args) {
	
				int[][] array = {  
						{ 95, 86 },						
						{ 83, 92, 96 },					
						{ 78, 83, 93, 87, 88 } };		
				
				int sum = 0;
				double avg = 0.0;
				
				int num = 0; // 
				for(int i=0; i<array.length; i++) { 
					for(int j=0; j<array[i].length; j++) { 
					
						sum = sum + array[i][j]; 
				
						num++;
						
					}
				}
				avg = (double)sum/num;
				System.out.println("총합 : " + sum);
				System.out.println("평균 : " + avg);
	}
}