// 8) 주어진 배열의 전체 항목의 합과 평균값을 구하라(중첩 for문 이용)

public class Exercise08 {

	public static void main(String[] args) {

		int[][] array = {
				{ 95, 86 },						// 0 1
				{ 83, 92, 96 },					// 0 1 2
				{ 78, 83, 93, 87, 88 } };		// 0 1 2 3 4
		
		int sum = 0;
		double avg = 0.0;
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.println(array[i][j]);
		}
	}
}
}
	/*		
			
		System.out.println(array.length);
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

		//int i = 0;
		//int j = 0;
//		int num = array.length;
//		System.out.println(num);
		
	//		sum += num[i];
		
		
//			for(i=0; i<array.length; i++) {
//				for(j=0; j<array.length; j++) {
//					System.out.println(array[i]);
			
			
//		 System.out.println("sum: " + sum);
//		 System.out.println("avg: " + avg);
	



		//int[][] intArray = new int[];
		
		//for (int i = 0; i < array.length; i++)

*/