package ch04_While;

import java.io.IOException;
import java.util.Scanner;

public class WhileKeyControlExample3 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     boolean run = true;
     int speed =0;
     int keyCode =0;
     Scanner scanner = new Scanner(System.in);
     
     //스캐너는 enter키 값을 제거 한 후 값을 리턴.
     while(run) {
    	 if(keyCode !=-1) {//Enter키가 아니면
    		 System.out.println("----------------");
    		 System.out.println("1.증속 | 2. 감속 | 3. 중지:");
    		 System.out.println("----------------");
    		 System.out.println("선택: ");
    	 }
    	 //'0'의 int값은 48 49-48=1, 50-48=2, 51-48=3
    	 keyCode = scanner.nextInt();
    	 
    	 if(keyCode==1) {//"1"
    		 speed++;
    		 System.out.println("현재 속도="+speed);
    	 }else if(keyCode==2) {//"2"
    		 speed--;
    		 System.out.println("현재 속도="+speed);
    	 }else if(keyCode==3) {//"3"
    		 run=false;
    	 }
     }//while끝.
		System.out.println("종료");
	}
}