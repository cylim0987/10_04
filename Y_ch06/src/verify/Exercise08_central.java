package verify;
// 8) �־��� �迭�� ��ü �׸��� �հ� ��հ��� ���϶�(��ø for�� �̿�)

public class Exercise08_central {
	public static void main(String[] args) {
	
				int[][] array = {  
						{ 95, 86 },						
						{ 83, 92, 96 },					
						{ 78, 83, 93, 87, 88 } };		
				
				int sum = 0;
				double avg = 0.0;
				int len = 0;
				int cnt = 0;
				
				
				for(int i=0; i<array.length; i++) { 
					for(int j=0; j<array[i].length; j++) { 
					
						sum = sum + array[i][j]; 
						
					}
					len+=array[i].length;
				}
				//avg = sum/(double)(array[0].length + array[1].length + array[2].length);
				//avg = sum/(double)(len);
				 avg = sum/(double)cnt;
				
				
				System.out.println("���� : " + sum);
				System.out.println("��� : " + avg);
	}
}