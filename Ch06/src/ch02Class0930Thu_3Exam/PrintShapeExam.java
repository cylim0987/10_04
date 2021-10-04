package ch02Class0930Thu_3Exam;

//하나의 소스파일에 여러개의 클래스 선언 가능
public class PrintShapeExam {
	public static void main(String[] args) {
		Shape shape = new Shape();
		Triangle triangle = new Triangle();
		Circle circle = new Circle();
		Square square = new Square();
}
	System.out.println(triangle.name);
	System.out.println(circle.name);
	System.out.println(square.name);

}
}



