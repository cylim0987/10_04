package For;

public class ForExam7 {

	public static void main(String[] args) {
//�ʱ�ȭ �κ��̳� �����κп� ,�� ��ɹ��� ������ �� ����.
	//for(�ʱ�ȭ;for���� ���������� ����;����) {���๮;}
	for(int i=1, y=1; i<10; i++ , System.out.println(y) ) {//for ���� ���������� ������ ���� ���, ������ true�� ����.
		System.out.println("hello");
		//for���� ���������� ������ �������� ó��{}
		if (i==10)
			break; //���� ���������� ��ɹ� break;
		y++;
	}
		System.out.println("����");

	}
}
	
