package overloading;

public class OverloadingDemo {

	public static void main(String[] args) {
		DemoClass demoClass = new DemoClass();
		System.out.println( demoClass.getString() );
		System.out.println( demoClass.getString( 2.3, 2.3) );
		System.out.println( demoClass.getString( 2.3, 1) );
		System.out.println( demoClass.getString( 1, 2.3) );
	}
}
