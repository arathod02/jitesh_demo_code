package overriding;

public interface Car {

	void performSpecializedBehaviour(); //Defined in each specialized class
	void moveCar(); //Defined in GenericCar
	void moveCar( int speed ); //Overloaded method
}
