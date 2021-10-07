package ch09_annotation;

public class PrintAnnotationExample {
	public static void main(String[] args) {
		Service service = new Service();
		//�޼ҵ����� ��� - reflection		
		Method[] declareMethods
			= Service.class.getDeclareMethods();
		Constructor[] cons
			=Service.class.getConstructors();
		Field[] fields=Service.class.getFields();
		
		//reflection
		for(Method method:declareMethods) {
			PrinatAnnotation printAnnotation
			= method.getAnnotation(PrintAnnotation.class);
			
			for(int=0; i<printAnnotation.number(); i++)
				System.out.println(printAnnotation.value());
			System.out.println();
		}
		
	}

}
