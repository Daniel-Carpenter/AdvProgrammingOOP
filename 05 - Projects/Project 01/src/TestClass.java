import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class TestClass 
{
	public static void main(String[] args) throws InterruptedException
	{
		DateTimeOne dateTimeOne = new DateTimeOne();
		dateTimeOne.dateTimeNow();
		System.out.println("Current Second: " + dateTimeOne.getValueOfSecond());
		
		TimeUnit.SECONDS.sleep(3);
		System.out.println("After-Sleep Second: " + dateTimeOne.getValueOfSecond());
		
		
		
	}
}
