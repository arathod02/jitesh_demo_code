package overriding;

public abstract class GenericCar implements Car {

	protected final String carBrandName;
	
	private static int carCount = 0;
	
	public GenericCar( final String carBrandName ) {
		this.carBrandName = carBrandName;
		incrementCarCount();
	}
	
	/*public GenericCar() {
		this.carBrandName = null;
		incrementCarCount();
	}*/
	
	
	

	
	private static void incrementCarCount(){
		carCount++;
	}
	
	public void performSpecializedBehaviour(){ 
		System.out.println("I am performing generic behaviour. Secialized classes can "
			+ " override me and do their own specialized behaviour");
	}
	
	@Override
	final public void moveCar() {
		System.out.println("Moving Car");
	}
	
	@Override
	public void moveCar( int speed ) {
		System.out.println("Moving Car " + this.carBrandName.toUpperCase() + " @ " + speed + " Kph");
	}
	
	public int returnCarCount(){
		return carCount;
	}

}
