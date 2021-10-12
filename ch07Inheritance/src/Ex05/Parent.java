/*5. Parent 클래스를 상속해서 Child 클래스를 다음과 같이 작성했는데,
 Child 클래스의 생성자에
서 컴파일 에러가 발생했습니다. 그 이유를 설명해보세요.*/


package Ex05;

public class Parent {

	public String name; 

	public Parent () {} //1. 부모 생성자에 default생성자가 없어서 만들어준다.
	public Parent(String name) {
	 this.name = name;
 }
 }
