/*16. PrinterExample 클래스에서 Printer 객체를 생성하고 println() 메소드를 호출해서 매개값
을 콘솔에 출력하려고 합니다. println() 메소드의 매개값으로는 int, boolean, double, String
값을 줄 수 있습니다. Printer 클래스에서 println() 메소드를 선언해보세요. */

package Check06;

public class PrinterExample {
	public static void main(String[] args) {
		Printer2 printer2 = new Printer2();
		printer2.println(10);
		printer2.println(true);
		printer2.println(5.7);
		printer2.println("홍길동");
	}
}