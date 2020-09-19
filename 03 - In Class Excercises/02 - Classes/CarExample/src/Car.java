
public class Car 
{	
	// non static, instance vars
	// incapsulation 
		// 1. make private vars
		// 2. make getters setts
	private String 	make;
	private String 	color;
	private int		year;
	
	public Car(String make, String color, int year)
	{
		this.make	= make;
		this.color	= color;
		this.year	= year;
	}

	public String getMake() 
	{
		return make;
	}

	public String getColor() 
	{
		return color;
	}

	public int getYear() 
	{
		return year;
	}
}
