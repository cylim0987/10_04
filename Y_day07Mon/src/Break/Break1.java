package Break;

public class Break1 {

	public static void main(String[] args) {

		
		// ���� �ݺ���
		for(int i=0; i<=9; i++) {
			System.out.print("i=" + i + "\t");
			for(int j=0; j<=9; j++) {
				System.out.print("j=" + j + "\t");
				if(j>4)
					break; //���� for���� ���.
			}
			System.out.println(); //�� �� �Ʒ��� ������
		}
	}

}
