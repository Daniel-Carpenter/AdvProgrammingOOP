import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestClass 
{
	public static void main(String[] args)
	{
		DateTimeOne dateTimeOne = new DateTimeOne();
		dateTimeOne.dateTimeNow();
		System.out.println("Current Second: " + dateTimeOne.getValueOfSecond());
		
	}
}
