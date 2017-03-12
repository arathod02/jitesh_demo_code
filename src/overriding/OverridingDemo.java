package overriding;

public class OverridingDemo {

	public static void main(String[] args) {

		Car car = new Audi("Audi");
		car.moveCar();
		car.moveCar(50);
		car.performSpecializedBehaviour();
		System.out.println("Car Count " + ((GenericCar)car).returnCarCount());
		
		car = new Mercedes("Mercedes");
		car.moveCar();
		car.moveCar(20);
		car.performSpecializedBehaviour();
		System.out.println("Car Count " + ((GenericCar)car).returnCarCount());

	}

}
