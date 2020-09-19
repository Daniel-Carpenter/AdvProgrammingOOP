import java.util.ArrayList;
import java.lang.Integer;


// Driver used for main method
public class Driver 
{
	public static void main (String[] args)
	{
		String make		= "Honda";
		String color	= "Silver";
		int year 		= 2016;
		ArrayList<Car> garage	= new ArrayList();
		
		Car c = new Car(make, color, year);
		System.out.println(c.getMake());
		System.out.println(c.getColor());
		System.out.println(c.getYear());
		
		
		garage.add(c);
		System.out.println(garage.get(0).toString());
		
		String info 		= "Taco; is; babeLike";
		String[] outputInfo = info.split("; ");
		String first	= outputInfo[0];
		String second	= outputInfo[1];
		String third	= outputInfo[2];
		
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		
		
		
// -------------------------------------------------------------------
		
		String hours;
		String mins;
		String secs;
		String timeOut;
		
		final int SEC_INDEX  = 0;
		final int MIN_INDEX  = 1;
		final int HOUR_INDEX = 2;
		
		int[] time = {22, 2}; // 22 sec, 9 mins
		
		if (time.length == 3)
		{
			hours = Integer.toString(time[HOUR_INDEX]);
			
			if (time[MIN_INDEX] < 10)
			{
				// put 0 in front of mins if less than 10
				mins = String.format("%02d", time[MIN_INDEX]);
			}
			else
			{
				// leave format the same if greater than 10
				mins = Integer.toString(time[MIN_INDEX]);								
			}
			
			secs	= Integer.toString(time[SEC_INDEX]);
			timeOut = hours + ":" + mins + ":" + secs;
		}
		
		else if (time.length == 2)
		{
			mins = Integer.toString(time[MIN_INDEX]);
			
			if (time[SEC_INDEX] < 10)
			{
				// put 0 in front of secs if less than 10				
				secs = String.format("%02d", time[SEC_INDEX]);
			}
			else
			{
				// leave format the same if greater than 10
				secs = Integer.toString(time[SEC_INDEX]);								
			}
						
			timeOut = mins + ":" + secs;
		}
		else
		{
			secs = Integer.toString(time[SEC_INDEX]);			
			
			timeOut = secs;
		}
		
		System.out.println(timeOut);
		

		

		
		
		
	}
}
