package Ch04Exercise;

public class Ch04Exercise004 {
public static void main(String[] args) {
		
	
	int i=0;
	int j=0;
	int cnt=1;
	
   while(true) {//���� �ݺ�
    i=(int)(Math.random()*6)+1;//ù��° �ֻ��� 1<=i<=6
    j=(int)(Math.random()*6)+1;//�ι�° �ֻ��� 1<=j<=6
  
    System.out.println("("+i+","+j+")");
    if(i+j==5) break;//���� �ݺ��� ���������� ����
    cnt++;
   }
   
   		System.out.println("�ѹݺ�Ƚ��:"+cnt);
	
}
}