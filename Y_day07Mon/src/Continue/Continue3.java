package Continue;

public class Continue3 {

	public static void main(String[] args) {

		
		//
		for(int i=0; i<=9; i++) {
			System.out.print("i=" + i + "\t");
			for(int j=0; j<=9; j++) {
				System.out.print("j=" + j);
				if(j>2) continue;//continue를 감싸는 가장 가까운 블럭
				System.out.print("나도 출력이 되는가\t");
			}
			System.out.println(); //한 줄 아래로 내리기
		}
		
	}

}
