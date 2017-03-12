package overriding;

public abstract class GenericCar implements Car {

	protected final String carBrandName;
	
	private static int carCount = 0;
	
	public GenericCar( final String carBrandName ) {
		this.carBrandName = carBrandName;
		incrementCarCount();
	}
	
	private static void incrementCarCount(){
		carCount++;
	}
	
	@Override
	final public void moveCar() {
		System.out.println("Moving " + this.carBrandName);
	}
	
	@Override
	public void moveCar( int speed ) {
		System.out.println("Moving " + this.carBrandName + " @ " + speed + " Kph");
	}
	
	public int returnCarCount(){
		return carCount;
	}

}
