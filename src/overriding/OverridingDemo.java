package overriding;

public class OverridingDemo {

	public static void main(String[] args) {

		Car car = new zxz("Audi");
		car.moveCar();
		car.moveCar(50);
		car.performSpecializedBehaviour();
		//System.out.println("Car Count " + ((GenericCar)car).returnCarCount());
		
		final Utility util = new Utility();
		util.printBrandName((GenericCar)car);
		
		car = new Mercedes("Mercedes");
		car.moveCar();
		car.moveCar(20);
		car.performSpecializedBehaviour();
		
		util.printBrandName((GenericCar)car);
		
		//System.out.println("Car Count " + ((GenericCar)car).returnCarCount());

	}

}
