package Array;

public class AloneTest {

	public static void main(String[] args) {
/*
		//int[] scores = {83, 90, 87};
		
		int[] scores;
		scores = new int[] {83, 90, 87};
		
		System.out.println(scores[2]);
	*/

		    int[] n= {12,20,67,567,21};
		    System.out.println("�迭�� ����:"+n.length);
			  	
		    for(int i=0;i<n.length;i++)
		    	System.out.println("["+i+"]="+n[i]);
			
		    System.out.println("���� for��");
			//���� for��
			for(int k:n) {
				System.out.println(k);
			 }
			}
		}
		
	}

}
