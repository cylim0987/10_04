//4��. while���� Math.random() �޼ҵ带 �̿��ؼ� �� ���� �ֻ����� ������ �� ������ ���� (��1, ��2) ���·� ����ϰ�, ���� ���� 5�� �ƴϸ� ��� �ֻ����� ������, ���� ���� 5�̸� ������ ���ߴ� �ڵ带 �ۼ��غ�����. ���� ���� 5�� �Ǵ� ������ (1, 4), (4, 1), (2, 3), (3, 2)�Դϴ�.

package Ch04Exercise;

//import java.util.Scanner;

public class Ch04Exercise {

	public static void main(String[] args) {

		
		while(true) {
			int i;
			i = (int)(Math.random()*6)+1;
			int j;
			j = (int)(Math.random()*6)+1;
		
		System.out.println("(" + i + "," + j + ")");
			if((i + j) == 5) {
				break;	
			}
		
		}
	}
}