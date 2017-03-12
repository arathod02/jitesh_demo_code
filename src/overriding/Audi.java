package overriding;

public class Audi extends GenericCar {

	public Audi(String carBrandName) {
		super(carBrandName);
	}

	@Override
	public void performSpecializedBehaviour() {
		System.out.println("Performing Audi's specialized behaviour");
	}
	
	@Override
	public void moveCar( int speed ) {
		System.out.println("Moving " + this.carBrandName + " @ " + speed + " Mph");
	}

}
