package Ex06;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
	}

}

//호출 순서와 실행 순서는 반대.
/*Parent(String nation) call
 
Parent() call
Child(String name) call
Child() call
*/
