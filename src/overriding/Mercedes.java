package overriding;

public class Mercedes extends GenericCar {

	public Mercedes(String carBrandName) {
		super(carBrandName);
	}

	@Override
	public void performSpecializedBehaviour() {
		System.out.println("Performing Mercedes's specialized behaviour");
	}

}
