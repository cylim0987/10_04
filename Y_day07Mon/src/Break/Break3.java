package Break;

public class Break3 {

	public static void main(String[] args) {

		
		// 이중 반복문을 전체 빠져나가려면 바깥쪽 for문이나  while문 앞에 Label:(뭐든 됨)을 표시하고 break문 뒤에 Label:표시.
	Label:	for(int i=0; i<=9; i++) {
			System.out.print("i=" + i + "\t");
			for(int j=0; j<=9; j++) {
				System.out.print("j=" + j + "\t");
				if(j>4)
					break Label; //안쪽 for문만 벗어남.
			}
			System.out.println(); //한 줄 아래로 내리기
		}
	}

}
