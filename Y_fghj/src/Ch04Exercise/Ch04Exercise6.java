package Ch04Exercise;

public class Ch04Exercise6 {
public static void main(String[] args) {
	for(int i=1; i<6; i++) {
		for(int j=1; j<i+1; j++) {
			System.out.print("*");
			if(j==i) { //j�� i�� ������ ����Ѵ�(�ƹ��͵����°�?)
				System.out.println();
			}
		}
	}
}

}



/* 6��.


*
**
***
****
*****


 for(int i=1; i<=5; i++) {
 	for(int j=1; j<=5









*/