//6번. for문을 이용해서 실행 결과와 같은 삼각형을 출력하는 코드를 작성하시오
package Ch04Exercise;
public class Ch04Exercise6 {
	public static void main(String[] args) {

	for(int i=1; i<6; i++) {
		for(int j=1; j<i+1; j++) {
			System.out.print("*");
			if(j==i) {
				System.out.println();
			}
		}
	}
	}

}