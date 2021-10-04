package Ch04Exercise;

public class Ch04Exercise6 {
public static void main(String[] args) {
	for(int i=1; i<6; i++) {
		for(int j=1; j<i+1; j++) {
			System.out.print("*");
			if(j==i) { //j가 i랑 같으면 출력한다(아무것도없는것?)
				System.out.println();
			}
		}
	}
}

}



/* 6번.


*
**
***
****
*****


 for(int i=1; i<=5; i++) {
 	for(int j=1; j<=5









*/