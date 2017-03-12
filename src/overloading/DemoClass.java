package overloading;

public class DemoClass {

	public String getString(){
		return "Hello";
	}
	
	public String getString( int numberOne, double numberTwo){
		return "Hello " + numberOne + " " + numberTwo;
	}
	
	public String getString( double numberOne, int numberTwo ){
		return "Hello " + numberOne + " " + numberTwo;
	}
	
	public String getString( double numberOne, double numberTwo ){
		return "Hello " + numberOne + " " + numberTwo;
	}
}
