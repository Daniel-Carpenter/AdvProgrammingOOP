import java.util.InputMismatchException;
import java.text.DecimalFormat;

public class Triangle 
{
	private double sideA;
	private double sideB;
	private double sideC;
	
	private int DEFAULT_SIDE = 1;
		
	// Formats
	private DecimalFormat FORMATER = new DecimalFormat("#,##0.0##");
	
	public Triangle(double sideA, double sideB, double sideC)
	{
		if (isTriangle(sideA, sideB, sideC))
		{
			this.sideA = sideA;
			this.sideB = sideB;
			this.sideC = sideC;				
			
			System.out.println("Successful Triangle!");
		}
		else
		{
			this.sideA = DEFAULT_SIDE;
			this.sideB = DEFAULT_SIDE;
			this.sideC = DEFAULT_SIDE;							
		}
	}
		
	public boolean isTriangle(double sideA, double sideB, double sideC)
	{
		try
		{			
			if (!(sideA > 0 && sideB > 0 && sideC > 0)) 
			{
				throw new InputMismatchException("Error: Sides must be positive values");
			}
			
			if (!(sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA))
			{
				throw new InputMismatchException("Error: Sum of any two sides much be greater than the third");				
			}

			// IF PASSES
				return true;			
		}
		catch (InputMismatchException except)
		{
			System.out.println(except.getMessage());
			return false;
		}
	}

	public String toString()
	{
		// Format Triangle
			return "Triangle(" + FORMATER.format(this.sideA) + ", " 
							   + FORMATER.format(this.sideB) + ", " 
							   + FORMATER.format(this.sideC) + ")";
	}
}
