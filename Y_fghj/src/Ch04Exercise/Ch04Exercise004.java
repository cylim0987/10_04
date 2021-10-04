package Ch04Exercise;

public class Ch04Exercise004 {
public static void main(String[] args) {
		
	
	int i=0;
	int j=0;
	int cnt=1;
	
   while(true) {//무한 반복
    i=(int)(Math.random()*6)+1;//첫번째 주사위 1<=i<=6
    j=(int)(Math.random()*6)+1;//두번째 주사위 1<=j<=6
  
    System.out.println("("+i+","+j+")");
    if(i+j==5) break;//무한 반복을 빠져나가는 조건
    cnt++;
   }
   
   		System.out.println("총반복횟수:"+cnt);
	
}
}