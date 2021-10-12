/*6. Parent 클래스를 상속받아 Child 클래스를 다음과 같이 작성했습니다.
 ChildExample 클래스
를 실행했을 때 호출되는 각 클래스의 생성자의 순서를 생각하면서
 출력 결과를 작성해보세요.*/

package Ex06;

public class Parent {
	public String nation;

	public Parent() {
		this("대한민국");
		System.out.println("Parent() call"); //2
	}

	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call"); //1
	}

}
