package If;
/*  �ֻ���(dice) 1~6 ���� ���� �ֻ���*/
public class RandomNumberExam {
	public static void main(String[] args) {
		
		
		// 0.0<= Math.random()��¹��� <1 . ���� ���
		// 0.0*10<= Math.random()*10 <1*10 . 
		// 0.0 <=Math.random()*10 < 10
		// (int)(0.0) <= (int)(Math.random()*10) < (int)10
		
		//double ran = Math.random();
		//System.out.println(ran);
		
		//double ran = Math.random()*10;
		//System.out.println(ran);
		
		double ran = (int)(Math.random()*10); // 0.0<= ���� < 10(9.9999...)
		System.out.println(ran);
		
		//�ڿ��� ������ ���� ��½�
		//(int)(Math.random()*����)+1
		int ranI = (int)(Math.random()*10)+1;// 0+1 <= ���� +1 < 10 +1 : 0~9 => 1~10
		System.out.println(ranI);
		
		/*
		int num =5;
		//�ڵ����� ����ɶ����� �����ϰ� ���� �ް� �ʹ�.��
		
		if(num==1) {
			System.out.println("1���� ���Խ��ϴ�.");
		}else if(num==2) {
			System.out.println("2���� ���Խ��ϴ�.");
		}else if(num==3) {
			System.out.println("3���� ���Խ��ϴ�.");
		}else if(num==4) {
			System.out.println("4���� ���Խ��ϴ�.");
		}else if(num==5) {
			System.out.println("5���� ���Խ��ϴ�.");
		}else {//if(num==6) {
			System.out.println("6���� ���Խ��ϴ�.");
		}
		*/
		
		
	}

}
