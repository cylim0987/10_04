package If;

public class If3 {

	public static void main(String[] args) {

		//Integer�� int�� wrapperŬ����
		//������ ���ڿ��κ��� intŸ�԰� ����޼ҵ�
		//Integer.paraseInt("����");		
		
		int num = Integer.parseInt(args[0]);
		if(num>0) {
			System.out.println(num);
		}else {
			System.out.println(-1*num);
		}
		
	}

}
