import java.util.ArrayList;
import java.lang.Integer;

public class Driver 
{
	public static void main (String[] args)
	{
		// Local Vars -----------------------------------------------------
		
			int GARAGE_SPACE = 0;
			ArrayList<Car> garage	= new ArrayList<Car>();	
			Car car = new Car("Honda", "Civic", 2016);
		
		// Create garage for Car and List Cars
			garage.add(car);
			System.out.println("Car in Garage--------------------- \n" + 
								garage.get(GARAGE_SPACE).toString());
		
		// Turn Car into SportsCar
			SportsCar sportsCar = new SportsCar(car.getMake(),
												car.getModel(),
												car.getYear());
			garage.set(GARAGE_SPACE, sportsCar);
			System.out.println("Modified Car into sportsCar ------ \n" + 
								garage.get(GARAGE_SPACE).toString());
	}
}
