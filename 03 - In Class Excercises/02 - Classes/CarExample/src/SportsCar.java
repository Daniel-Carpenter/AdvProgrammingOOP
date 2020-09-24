
public class SportsCar extends Car
{
	public SportsCar (String make, String model, int year)
	{
		super(make, model, year);
	}
	
	public String getMake()
	{
		return "Turbo " + super.getMake();
	}
	
	
}
