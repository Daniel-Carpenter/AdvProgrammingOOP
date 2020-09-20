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
				DateTimeFormatter formattedDateTime = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a");
			
			// Get Local Time
				LocalDateTime showDateTime = LocalDateTime.now();
				
			// Create String Var with Formatted DateTime
				String formattedDateTimeFinal = showDateTime.format(formattedDateTime);
				
			// Print Current Date/Time
			    System.out.println("Current Date/Time: " + formattedDateTimeFinal);	    
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
		TimeUnit.SECONDS.sleep(3);
	}
}