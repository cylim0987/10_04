package verify;
//7) 주어진 배열의 항목에서 최대값을 구하라(for문 이용)

public class Exercise07 {

	public static void main(String[] args) {
		
	int max = 0;
	int[] array = { 1, 5, 3, 8, 2 };

	for(int i=0; i<array.length; i++) {
		for(int j=i+1; j<array.length; j++) {
			if(array[i] > array[j]) {
				max = array[i];
				array[i]=array[j]; 
				array[j]=max;
			}
	
		}
	}
	System.out.println("max: " + max);
	
	}
}
