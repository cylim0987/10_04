package ch09_annotation;

public class PrintAnnotationExample {

	public static void main(String[] args) {
		Service service = new Service();
		
		Method[] declareMethods=Service.class.getDeclaredMethods();
			= Service.class.getDeclareMethods();
		for(Method method:declareMethods) {
			PrinatAnnotation printAnnotation
			= method.getAnnotation(PrintAnnotation.class);
			
			for(int=0; i<printAnnotation.number(); i++)
				System.out.println(printAnnotation.value());
		}
		
	}

}