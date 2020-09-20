import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;
import javax.print.DocFlavor.STRING;

public class DateTimeOne
{
	public void dateTimeNow() 
	{
		// Date/time object for date/time ---------------------------------------------------------------
			// Set Time Format
				DateTimeFormatter secondFormat = DateTimeFormatter.ofPattern("s");
			
			// Get Local Time
				LocalDateTime showDateTime = LocalDateTime.now();
				
			// Create String Var with Formatted DateTime
				int currentSecond = Integer.parseInt(showDateTime.format(secondFormat));

			// Print Current Date/Time
			    System.out.println("The value of Second now: " + currentSecond);	    
	}
	
	public int getValueOfSecond() 
	{
		// Date/time object for date/time ---------------------------------------------------------------
			// Set Time Format
				DateTimeFormatter secondFormat = DateTimeFormatter.ofPattern("s");
			
			// Get Local Time
				LocalDateTime showDateTime = LocalDateTime.now();
				
			// Create String Var with Formatted DateTime
				int currentSecond = Integer.parseInt(showDateTime.format(secondFormat));
						
		return currentSecond;
	}

	public void sleepForThreeSec() throws InterruptedException 
	{
		try 
		{
			TimeUnit.SECONDS.sleep(3);
		} 
		catch(InterruptedException ex) 
		{
			ex.printStackTrace();
		}
	}
}